package metier.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Promotion implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idPromotion;
@Temporal(TemporalType.DATE)
@Column(name="Date_debut")
private Date dateDebut;
@Temporal(TemporalType.DATE)
@Column(name="Date_Fin")
private Date dateFin;

@OneToMany(mappedBy="promotion")
private List<LigneLivrePromotion> livre;

public Long getIdPromotion() {
	return idPromotion;
}
public void setIdPromotion(long idPromotion) {
	this.idPromotion = idPromotion;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public Promotion(Long idPromotion, Date dateDebut, Date dateFin) {
	super();
	this.idPromotion = idPromotion;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
}
public Promotion() {
	super();
	// TODO Auto-generated constructor stub
}



}
