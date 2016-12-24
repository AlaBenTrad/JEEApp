package metier.sessions;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import metier.entities.Client;
import metier.entities.Commande;
import metier.entities.Compte;
import metier.entities.Editeur;
import metier.entities.Livre;
import metier.entities.Promotion;

@Stateless(name="dsprojet")

public class LivreEJBImpl implements IBibRemote, IBibLocal{
@PersistenceContext(unitName="Koja")
private EntityManager em;

	@Override
	public void addLivre(Livre L) {
		// TODO Auto-generated method stub
		em.persist(L);
	}

	@Override
	public List<Livre> consulterLivres() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select L from Livre L");
		return req.getResultList();
	}

	@Override
	public Livre consulterLivres(Long ID_Livre) {
		// TODO Auto-generated method stub
		Livre Li=em.find(Livre.class,ID_Livre);
		if(Li == null) throw new RuntimeException("Livre Introuvable");
		return Li;
	}

	@Override
	public void updateLivre(Livre L) {
		// TODO Auto-generated method stub
		em.merge(L);
	}

	@Override
	public void supprimerLivre(Long ID_livre) {
		// TODO Auto-generated method stub
		Livre Li=consulterLivres(ID_livre);
		em.remove(ID_livre);
	}

	@Override
	public void addPromotion(Promotion P) {
		// TODO Auto-generated method stub
		em.persist(P);
	}

	@Override
	public List<Promotion> consulterPromotion() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select P from Promotion P");
		return req.getResultList();
	}

	@Override
	public Promotion consulterPromotion(Long ID_promotion) {
		// TODO Auto-generated method stub
		Promotion P=em.find(Promotion.class, ID_promotion);
		if(P==null) throw new RuntimeException("Promotion introuvable");
		return P;
	}

	@Override
	public void updatePromotion(Promotion P) {
		// TODO Auto-generated method stub
		em.merge(P);
	}

	@Override
	public void supprimerPromotion(Long ID_promotion) {
		// TODO Auto-generated method stub
		Promotion P=consulterPromotion(ID_promotion);
		em.remove(ID_promotion);
		
	}

	@Override
	public void addClient(Client L) {
		// TODO Auto-generated method stub
		em.persist(L);
	}

	@Override
	public List<Client> consulterClients() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select C from Client C");
		return req.getResultList();
	}

	@Override
	public Client consulterClients(Long ID_Client) {
		// TODO Auto-generated method stub
		Client C=em.find(Client.class, ID_Client);
		if(C==null) throw new RuntimeException("Client introuvable");
		return C;
	}

	@Override
	public void updateClient(Client L) {
		// TODO Auto-generated method stub
		em.merge(L);
		
	}

	@Override
	public void supprimerClient(Long ID_Client) {
		// TODO Auto-generated method stub
		Client Li=consulterClients(ID_Client);
		em.remove(ID_Client);
	}

	@Override
	public void addCommande(Commande L) {
		// TODO Auto-generated method stub
		em.persist(L);
	}

	@Override
	public List<Commande> consulterCommandes() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select C from Commande C");
		return req.getResultList();
	}

	@Override
	public Commande consulterCommandes(Long ID_Commande) {
		// TODO Auto-generated method stub
		Commande C=em.find(Commande.class, ID_Commande);
		if(C==null) throw new RuntimeException("Commnade introuvable");
		return C;
	}

	@Override
	public void updateCommande(Commande L) {
		// TODO Auto-generated method stub
		em.merge(L);
		
	}

	@Override
	public void supprimerCommande(Long ID_Commande) {
		// TODO Auto-generated method stub
		Commande Li=consulterCommandes(ID_Commande);
		em.remove(ID_Commande);
	}

	@Override
	public void addCompte(Compte L) {
		// TODO Auto-generated method stub
		em.persist(L);
	}

	@Override
	public List<Compte> consulterComptes() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select C from Compte C");
		return req.getResultList();
	}

	@Override
	public Compte consulterComptes(Long ID_Compte) {
		// TODO Auto-generated method stub
		Compte C=em.find(Compte.class, ID_Compte);
		if(C==null) throw new RuntimeException("Compte introuvable");
		return C;
	}

	@Override
	public void updateCompte(Compte L) {
		// TODO Auto-generated method stub
		em.merge(L);
	}

	@Override
	public void supprimerCompte(Long ID_Compte) {
		// TODO Auto-generated method stub
		Compte Li=consulterComptes(ID_Compte);
		em.remove(ID_Compte);
	}

	@Override
	public void addEditeur(Editeur L) {
		// TODO Auto-generated method stub
		em.persist(L);
	}

	@Override
	public List<Editeur> consulterEditeurs() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select C from Editeur C");
		return req.getResultList();
	}

	@Override
	public Editeur consulterEditeurs(Long ID_Editeur) {
		// TODO Auto-generated method stub
		Editeur C=em.find(Editeur.class, ID_Editeur);
		if(C==null) throw new RuntimeException("Editeur introuvable");
		return C;
	}

	@Override
	public void updateEditeur(Editeur L) {
		// TODO Auto-generated method stub
		em.merge(L);
	}

	@Override
	public void supprimerEditeur(Long ID_Editeur) {
		// TODO Auto-generated method stub
		Editeur Li=consulterEditeurs(ID_Editeur);
		em.remove(ID_Editeur);
	}

	@Override
	public List<Promotion> consulterPromotions() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select C from Promotion C");
		return req.getResultList();
	}

	@Override
	public Promotion consulterPromotions(Long idPromotion) {
		// TODO Auto-generated method stub
		Promotion C=em.find(Promotion.class, idPromotion);
		if(C==null) throw new RuntimeException("Promotion introuvable");
		return C;
	}

	
}
