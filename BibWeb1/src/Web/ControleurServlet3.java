package Web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Editeur;
import metier.sessions.IBibLocal;

@WebServlet(name = "cs3", urlPatterns = {"/Controleur3"}) /*localhost:8080/nomprojetweb/controler2*/
public class ControleurServlet3 extends HttpServlet{
@EJB
	private IBibLocal metier;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Vuebiblio3.jsp").forward(request, response); /*appel de localhost*/
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action.equals("Consulter"))
		{
			Long idEditeur=Long.parseLong(request.getParameter("code"));
			request.setAttribute("code", idEditeur);
			Editeur L = metier.consulterEditeurs(idEditeur);
			request.setAttribute("Editeur", L);
		}
		else {
			request.setAttribute("Editeur", metier.consulterEditeurs());
		}
		doGet(request, response);
	}
}
