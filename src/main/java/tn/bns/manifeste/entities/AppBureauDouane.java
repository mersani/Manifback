package tn.bns.manifeste.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table
public class AppBureauDouane implements Serializable {

	@Id
	@Column (name="BURD_ID")
	private Long burDId;
	

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "bureauDouane")
	private List<AppManifeste> appManifeste;
	
	
	
	public AppBureauDouane() {
		super();
	}

	public Long getBurDId() {
		return burDId;
	}

	public void setBurDId(Long burDId) {
		this.burDId = burDId;
	}

	public List<AppManifeste> getAppManifeste() {
		return appManifeste;
	}

	public void setAppManifeste(List<AppManifeste> appManifeste) {
		this.appManifeste = appManifeste;
	}
}

