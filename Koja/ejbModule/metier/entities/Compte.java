package metier.entities;

import java.io.*;


import javax.persistence.*;
@Entity
public class Compte implements Serializable{

@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idCompte;
@Column(name="identifiant")
private long login;
@Column(name="MotDePass")
private long mdp;

@ManyToOne
@JoinColumn(name="idClient")
private Client client ;

public Long getIdCompte() {
	return idCompte;
}

public void setIdCompte(Long idCompte) {
	this.idCompte = idCompte;
}

public long getLogin() {
	return login;
}

public void setLogin(long login) {
	this.login = login;
}

public long getMdp() {
	return mdp;
}

public void setMdp(long mdp) {
	this.mdp = mdp;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Compte(Long idCompte, long login, long mdp, Client client) {
	super();
	this.idCompte = idCompte;
	this.login = login;
	this.mdp = mdp;
	this.client = client;
}

public Compte() {
	super();
	// TODO Auto-generated constructor stub
}

}
