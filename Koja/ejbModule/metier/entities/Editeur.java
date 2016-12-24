package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Editeur implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private long idEditeur;
@Column(name="Nom_Editeur")
private String nomEditeur;

@OneToMany(mappedBy="editeur")
private Collection<Livre> livre;

public long getIdEditeur() {
	return idEditeur;
}

public void setIdEditeur(long idEditeur) {
	this.idEditeur = idEditeur;
}

public String getNomEditeur() {
	return nomEditeur;
}

public void setNomEditeur(String nomEditeur) {
	this.nomEditeur = nomEditeur;
}

public Collection<Livre> getLivre() {
	return livre;
}

public void setLivre(Collection<Livre> livre) {
	this.livre = livre;
}

public Editeur(long idEditeur, String nomEditeur, Collection<Livre> livre) {
	super();
	this.idEditeur = idEditeur;
	this.nomEditeur = nomEditeur;
	this.livre = livre;
}

public Editeur() {
	super();
	// TODO Auto-generated constructor stub
}








}
