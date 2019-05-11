package tn.bns.manifeste.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.metamodel.StaticMetamodel;


import com.fasterxml.jackson.annotation.JsonIgnore;

//@Stateless
@Entity
@Table(name="AppUser")
@Inheritance(strategy=InheritanceType.JOINED)
public class AppUser implements Serializable {
	
	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="ID_UTILISATEUR",nullable=false)
	private Long id;
	
	@Column(name="NOM_UTILISATEUR",nullable=false)
	private String username;
	
	@Column(name="PASSWORD_UTILISATEUR",nullable=false)
	private String password;
	
	@Column(name="email_UTILISATEUR",nullable=false)
	private String userEmail;
	
	@Column(name="CIN_UTILISATEUR",nullable=false)
	private String userCin; 
	
	@Column(name="PARTENAIRE_UTILISATEUR",nullable=false)
	private String userPartenaire; 
	
	@Column(name="GROUPE_UTILISATEUR",nullable=false)
	private String userGroupe;
	
	@Column(name="MOIS_INSCREPTION",nullable=false)
	private String moisinscreption;
	
	/*@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER)
	private List<AppRole> roles =new ArrayList<>();*/
	
	@ManyToMany(fetch=FetchType.EAGER  )
	@JoinTable(name = "app_user_roles",
	joinColumns = { @JoinColumn(name = "app_user_id_utilisateur", referencedColumnName = "ID_UTILISATEUR")}, 
	inverseJoinColumns = { @JoinColumn(name = "roles_id_role", referencedColumnName = "ID_ROLE")})
	private Collection<AppRole> userRoles ;
	
	/*@ManyToOne
	@JoinColumn
	private AppRole roles; */
	
	/*@ManyToMany(fetch=FetchType.EAGER)
	private Collection<AppRole> roles =new ArrayList<>();*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCin() {
		return userCin;
	}
	public void setUserCin(String userCin) {
		this.userCin = userCin;
	}
	public String getUserPartenaire() {
		return userPartenaire;
	}
	public void setUserPartenaire(String userPartenaire) {
		this.userPartenaire = userPartenaire;
	}
	public String getUserGroupe() {
		return userGroupe;
	}
	public void setUserGroupe(String userGroupe) {
		this.userGroupe = userGroupe;
	}


	
	
	public String getMoisinscreption() {
		return moisinscreption;
	}

	public void setMoisinscreption(String moisinscreption) {
		this.moisinscreption = moisinscreption;
	}

	public Collection<AppRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Collection<AppRole> userRoles) {
		this.userRoles = userRoles;
	}

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", username=" + username + ", password=" + password + ", userEmail=" + userEmail
				+ ", userCin=" + userCin +  ", userRoles=" + userRoles + "]";
	}

	public AppUser(String username, String password, String userEmail, String userCin, String userPartenaire,
			String userGroupe, String moisinscreption, Collection<AppRole> userRoles) {
		super();
		this.username = username;
		this.password = password;
		this.userEmail = userEmail;
		this.userCin = userCin;
		this.userPartenaire = userPartenaire;
		this.userGroupe = userGroupe;
		this.moisinscreption = moisinscreption;
		this.userRoles = userRoles;
	}

	public AppUser(String username, String password, String userEmail, String userCin, String userPartenaire, String userGroupe, String moisinscreption) {
		this.username = username;
		this.password = password;
		this.userEmail = userEmail;
		this.userCin = userCin;
		this.userPartenaire = userPartenaire;
		this.userGroupe = userGroupe;
		this.moisinscreption = moisinscreption;
	}
}
	
	



	

	

