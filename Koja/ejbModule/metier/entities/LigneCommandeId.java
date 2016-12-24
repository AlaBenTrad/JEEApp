package metier.entities;

import java.io.Serializable;

import javax.persistence.*;

public class LigneCommandeId implements Serializable{

	
	private Long idCommande;
	private Long ID_Livre;
	
	
	   
	public Long getID_Livre() {
		return ID_Livre;
	}
	public void setID_Livre(Long iD_Livre) {
		ID_Livre = iD_Livre;
	}
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	
	
	
	public LigneCommandeId(Long iD_Livre, Long idCommande) {
		super();
		ID_Livre = iD_Livre;
		this.idCommande = idCommande;
	}
	
	
	public LigneCommandeId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID_Livre ^ (ID_Livre >>> 32));
		result = prime * result + (int) (idCommande ^ (idCommande >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneCommandeId other = (LigneCommandeId) obj;
		if (ID_Livre != other.ID_Livre)
			return false;
		if (idCommande != other.idCommande)
			return false;
		return true;
	}
	
	
	
}
