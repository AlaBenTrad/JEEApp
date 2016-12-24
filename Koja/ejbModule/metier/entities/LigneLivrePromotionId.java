package metier.entities;

import java.io.Serializable;

public class LigneLivrePromotionId implements Serializable{
	
	 private Long ID_Livre;
	 private Long idPromotion;
	 
	
	
	public LigneLivrePromotionId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneLivrePromotionId(Long iD_Livre, Long idPromotion) {
		super();
		ID_Livre = iD_Livre;
		this.idPromotion = idPromotion;
	}
	public Long getID_Livre() {
		return ID_Livre;
	}
	public void setID_Livre(Long iD_Livre) {
		ID_Livre = iD_Livre;
	}
	public Long getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(Long idPromotion) {
		this.idPromotion = idPromotion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID_Livre ^ (ID_Livre >>> 32));
		result = prime * result + (int) (idPromotion ^ (idPromotion >>> 32));
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
		LigneLivrePromotionId other = (LigneLivrePromotionId) obj;
		if (ID_Livre != other.ID_Livre)
			return false;
		if (idPromotion != other.idPromotion)
			return false;
		return true;
	}
	 

}
