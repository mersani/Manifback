package tn.bns.manifeste.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.web.server.ServerHttpSecurity.OAuth2ResourceServerSpec.JwtSpec;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		if (request.getMethod().equals("OPTIONS")) {
			response.setStatus(HttpServletResponse.SC_OK);

		} else {
			String jwt = request.getHeader(SecurityConstantes.HEADER_STRING);
			System.out.println("****** token ****" + jwt);
			if (jwt == null || !jwt.startsWith(SecurityConstantes.TOKEN_PERFIX)) {
				System.out.println("---- jwt null ------");
				chain.doFilter(request, response);
				return;
			} else {
				System.out.println("---- jwt not null ------");
				Claims claims = Jwts.parser().setSigningKey(SecurityConstantes.SECRET)
						.parseClaimsJws(jwt.replace(SecurityConstantes.TOKEN_PERFIX, "")).getBody();
				String username = claims.getSubject();
				ArrayList<Map<String, String>> roles = (ArrayList<Map<String, String>>) claims.get("roles");
				System.out.println("++++++++" + roles);
				Collection<GrantedAuthority> authorities = new ArrayList();
				roles.forEach(r -> {

					authorities.add(new SimpleGrantedAuthority(r.get("authority")));

				});

				UsernamePasswordAuthenticationToken authenticatedUser = new UsernamePasswordAuthenticationToken(
						username, null, authorities);
				SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
				chain.doFilter(request, response);
			}

		}

	}
}
