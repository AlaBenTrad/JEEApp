package metier.sessions;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Client;
import metier.entities.Commande;
import metier.entities.Compte;
import metier.entities.Editeur;
import metier.entities.Livre;
import metier.entities.Promotion;
@Local
public interface IBibLocal {
    
	//livre
	public List<Livre> consulterLivres();
	public Livre consulterLivres(Long ID_Livre);
	
	//promotion
	public List<Promotion> consulterPromotions();
	public Promotion consulterPromotions(Long idPromotion);
	
	//Client
	public List<Client> consulterClients();
	public Client consulterClients(Long idClient);
	
	//Commande
	public List<Commande> consulterCommandes();
	public Commande consulterCommandes(Long idCommande);
	
	//Compte
	public List<Compte> consulterComptes();
	public Compte consulterComptes(Long idCompte);
	
	//Editeur
	public List<Editeur> consulterEditeurs();
	public Editeur consulterEditeurs(Long idEditeur);
}
