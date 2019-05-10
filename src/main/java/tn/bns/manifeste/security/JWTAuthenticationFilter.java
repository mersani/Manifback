package tn.bns.manifeste.security;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import tn.bns.manifeste.entities.AppUser;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	private AuthenticationManager authenticationManager;

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {

		AppUser user = null;
		try {
		//	System.out.println(" attempt " + request.getInputStream().toString());
			user = new ObjectMapper().readValue(request.getInputStream(), AppUser.class);
			System.out.println("user attempt " + user.toString());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		System.out.println("--------------");
		System.out.println("-UserName-" + user.getUsername());
		System.out.println("-Password-" + user.getPassword());
		return authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {

		User springUser = (User) authResult.getPrincipal();
		System.out.println("*** sucessful ****" + springUser);
		String jwt = Jwts.builder().setSubject(springUser.getUsername())
				.setExpiration(new Date(System.currentTimeMillis() + SecurityConstantes.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SecurityConstantes.SECRET)
				.claim("roles", springUser.getAuthorities()).compact();
		response.addHeader(SecurityConstantes.HEADER_STRING, SecurityConstantes.TOKEN_PERFIX + jwt);
		System.out.println("jwt " + jwt);

	}
}
