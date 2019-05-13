package tn.bns.manifeste.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class AppNationaliteMoyenTransport implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ID_NAT_MOYENT")
	private Long NATmoyenT_id;

	@ManyToOne
	@JoinColumn (name="ID_MOYENT")
	private AppMoyenTransport appMoyenTransport;
	
	public long getNATmoyenT_id() {
		return NATmoyenT_id;
	}

	public void setNATmoyenT_id(Long nATmoyenT_id) {
		NATmoyenT_id = nATmoyenT_id;
	}

	public AppNationaliteMoyenTransport() {
		super();

	}

	public AppNationaliteMoyenTransport(AppMoyenTransport appMoyenTransport) {
		super();
		this.appMoyenTransport = appMoyenTransport;
	} 
	
	

}
