package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table (name = "LIVRE")
public class Livre implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long ID_Livre;
	 
	 private String titre;
	 
	 @Column(name = "Nom_Auteur")
	 private String nomAuteur; 
	 
	 @Column(name = "Prix")
	 private long prix;
	 
	 @Temporal(TemporalType.DATE)
	 @Column(name="DATE_appartition")
	 private Date dateAppartition;
    
     
	 @OneToMany(mappedBy="livre")
	 private List<LigneCommande> commande;
	 
	 @ManyToOne
	 @JoinColumn(name="idEditeur")
	 private Editeur editeur ;
	 
	 @OneToMany(mappedBy="livre")
	 private List<LigneLivrePromotion> promotion;

	public Long getID_Livre() {
		return ID_Livre;
	}

	public void setID_Livre(Long iD_Livre) {
		ID_Livre = iD_Livre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public Date getDateAppartition() {
		return dateAppartition;
	}

	public void setDateAppartition(Date dateAppartition) {
		this.dateAppartition = dateAppartition;
	}

	public List<LigneCommande> getCommande() {
		return commande;
	}

	public void setCommande(List<LigneCommande> commande) {
		this.commande = commande;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public List<LigneLivrePromotion> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<LigneLivrePromotion> promotion) {
		this.promotion = promotion;
	}

	public Livre(Long iD_Livre, String titre, String nomAuteur, long prix, Date dateAppartition,
			List<LigneCommande> commande, Editeur editeur, List<LigneLivrePromotion> promotion) {
		super();
		ID_Livre = iD_Livre;
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.prix = prix;
		this.dateAppartition = dateAppartition;
		this.commande = commande;
		this.editeur = editeur;
		this.promotion = promotion;
	}
	
	public Livre(long iD_Livre, String titre, String nomAuteur)
	{
		super();
		ID_Livre = iD_Livre;
		this.titre = titre;
		this.nomAuteur = nomAuteur;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

}