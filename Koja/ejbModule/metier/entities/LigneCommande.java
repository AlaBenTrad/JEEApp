package metier.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@IdClass(LigneCommandeId.class)
public class LigneCommande implements Serializable{
	@Id
	private Long idCommande;
	@Id
	private Long ID_Livre;
	
	
	@ManyToOne
	@JoinColumn(name="ID_Livre",updatable = false, insertable = false )
    private Livre livre;
	
	@ManyToOne
	@JoinColumn(name="idCommande",updatable = false, insertable = false)
	private Commande commande;

	

	

	
	
}
