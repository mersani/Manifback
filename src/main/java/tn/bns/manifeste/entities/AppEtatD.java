package tn.bns.manifeste.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table
public class AppEtatD {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ETAT_DIFFERENTIEL" )
    private Long etatId;


	@OneToOne
	@JoinColumn(name= "ID_MANIFESTE") 
	private AppManifeste manifeste;

    @Column(name="ETAT_DIFFERENTIEL" )
    private String etatText;

    public Long getEtatId() {
        return etatId;
    }

    public void setEtatId(Long etatId) {
        this.etatId = etatId;
    }

    public AppManifeste getManifeste() {
        return manifeste;
    }

    public void setManifeste(AppManifeste manifeste) {
        this.manifeste = manifeste;
    }

    public String getEtatText() {
        return etatText;
    }

    public void setEtatText(String etatText) {
        this.etatText = etatText;
    }

    public AppEtatD(AppManifeste manifeste, String etatText) {
        this.manifeste = manifeste;
        this.etatText = etatText;
    }

    public AppEtatD() {
    }
}

