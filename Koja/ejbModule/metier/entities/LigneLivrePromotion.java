package metier.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(LigneLivrePromotionId.class)

public class LigneLivrePromotion implements Serializable {

	@Id
	private Long ID_Livre;
	@Id
	private Long idPromotion;
	
	@ManyToOne
	@JoinColumn(name="ID_Livre",updatable = false, insertable = false )
    private Livre livre;
	
	@ManyToOne
	@JoinColumn(name="idPromotion",updatable = false, insertable = false)
	private Promotion promotion;
}
