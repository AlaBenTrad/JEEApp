package Web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Livre;
import metier.entities.Promotion;
import metier.sessions.IBibLocal;

@WebServlet(name = "cs2", urlPatterns = {"/Controleur2"}) /*localhost:8080/nomprojetweb/controler2*/
public class ControleurServlet2 extends HttpServlet{
@EJB
	private IBibLocal metier;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Vuebiblio2.jsp").forward(request, response); /*appel de localhost*/
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action.equals("Consulter"))
		{
			Long idPromotion=Long.parseLong(request.getParameter("code"));
			request.setAttribute("code", idPromotion);
			Promotion L = metier.consulterPromotions(idPromotion);
			request.setAttribute("Promotion", L);
		}
		else {
			request.setAttribute("Promotion", metier.consulterPromotions());
		}
		doGet(request, response);
	}
}
