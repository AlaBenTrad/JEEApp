package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Client implements Serializable {
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idClient;
private String nomClient;
private String adresse;
private String email;
private String tel;

@OneToMany(mappedBy="client")
private Collection<Commande> commandes;

@OneToMany(mappedBy="client")
private Collection<Compte> compte;

public Long getIdClient() {
	return idClient;
}

public void setIdClient(Long idClient) {
	this.idClient = idClient;
}

public String getNomClient() {
	return nomClient;
}

public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public Collection<Commande> getCommandes() {
	return commandes;
}

public void setCommandes(Collection<Commande> commandes) {
	this.commandes = commandes;
}

public Collection<Compte> getCompte() {
	return compte;
}

public void setCompte(Collection<Compte> compte) {
	this.compte = compte;
}

public Client(Long idClient, String nomClient, String adresse, String email, String tel, Collection<Commande> commandes,
		Collection<Compte> compte) {
	super();
	this.idClient = idClient;
	this.nomClient = nomClient;
	this.adresse = adresse;
	this.email = email;
	this.tel = tel;
	this.commandes = commandes;
	this.compte = compte;
}

public Client() {
	super();
	// TODO Auto-generated constructor stub
}


}
