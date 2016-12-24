package metier.sessions;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Client;
import metier.entities.Commande;
import metier.entities.Compte;
import metier.entities.Editeur;
import metier.entities.Livre;
import metier.entities.Promotion;

@Remote
public interface IBibRemote {
    
	//livre
	public void addLivre(Livre L);
	public List<Livre> consulterLivres();
	public Livre consulterLivres(Long ID_Livre);
	public void updateLivre(Livre L);
	public void supprimerLivre(Long ID_livre);
	
	//promotion
	public void addPromotion(Promotion P);
	public List<Promotion> consulterPromotion();
	public Promotion consulterPromotion(Long ID_promotion);
	public void updatePromotion(Promotion P);
	public void supprimerPromotion(Long ID_promotion);
	
	//Client
	public void addClient(Client L);
	public List<Client> consulterClients();
	public Client consulterClients(Long ID_Client);
	public void updateClient(Client L);
	public void supprimerClient(Long ID_Client);
	
	//Commande
	public void addCommande(Commande L);
	public List<Commande> consulterCommandes();
	public Commande consulterCommandes(Long ID_Commande);
	public void updateCommande(Commande L);
	public void supprimerCommande(Long ID_Commande);
	
	//Compte
	public void addCompte(Compte L);
	public List<Compte> consulterComptes();
	public Compte consulterComptes(Long ID_Compte);
	public void updateCompte(Compte L);
	public void supprimerCompte(Long ID_Compte);
	
	//Editeur
	public void addEditeur(Editeur L);
	public List<Editeur> consulterEditeurs();
	public Editeur consulterEditeurs(Long ID_Editeur);
	public void updateEditeur(Editeur L);
	public void supprimerEditeur(Long ID_Editeur);
}
