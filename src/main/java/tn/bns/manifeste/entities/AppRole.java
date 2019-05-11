package tn.bns.manifeste.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import antlr.collections.List;



@Entity
@Table(name="AppRole")
public class AppRole implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ID_ROLE",nullable=false)
	private Long id ;
	
	/*@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY , mappedBy="roles")
	private Collection<AppUser> users; */
	
	
	
	
	/*@OneToMany(mappedBy="roles" ,cascade=CascadeType.ALL)
	@JoinColumn (name="ID_UTILISATEUR")
	private Collection<AppUser> appUser;*/
	
	@Column(name="NAME_ROLE",nullable=false)
	private String roleName;
	
	
	
	
	@Override
	public String toString() {
		return "AppRole [id=" + id + ", roleName=" + roleName + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public AppRole() {
		super();
		// TODO Auto-generated constructor stub
	}
public AppRole(String roleName) {
	super();
	this.roleName = roleName;
}


//	public AppUser getAppUser() {
//		return appUser;p
//	}
//	public void setAppUser(AppUser appUser) {
//		this.appUser = appUser;
	//
//}
	
	






	
	
	
	

	
	
}
