package metier.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.entities.Livre;
import metier.sessions.IBibLocal;
import java.util.List;

@Stateless
@WebService
public class BibServiceSoap {

	@EJB
	private IBibLocal metier;
	@WebMethod
	public List<Livre> consulterLivres(){
		return metier.consulterLivres();
	}
	@WebMethod
	public Livre consulterLivre(@WebParam(name="codelivres")long ID_livre){
	return metier.consulterLivres(ID_livre);	
	}
}
