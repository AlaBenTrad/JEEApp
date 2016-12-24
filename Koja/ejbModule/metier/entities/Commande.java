package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Commande")
public class Commande implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idCommande;
private Date dateCommande;

@Column(name="Mode_paiement")
private String modePaiement;

@ManyToOne
@JoinColumn(name="idClient")
private Client client ;

@OneToMany(mappedBy="commande")
private List<LigneCommande> livre;

public Long getIdCommande() {
	return idCommande;
}

public void setIdCommande(Long idCommande) {
	this.idCommande = idCommande;
}

public Date getDateCommande() {
	return dateCommande;
}

public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}

public String getModePaiement() {
	return modePaiement;
}

public void setModePaiement(String modePaiement) {
	this.modePaiement = modePaiement;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public List<LigneCommande> getLivre() {
	return livre;
}

public void setLivre(List<LigneCommande> livre) {
	this.livre = livre;
}

public Commande(Long idCommande, Date dateCommande, String modePaiement, Client client, List<LigneCommande> livre) {
	super();
	this.idCommande = idCommande;
	this.dateCommande = dateCommande;
	this.modePaiement = modePaiement;
	this.client = client;
	this.livre = livre;
}

public Commande() {
	super();
	// TODO Auto-generated constructor stub
}






}
