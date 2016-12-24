package Web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Livre;
import metier.sessions.IBibLocal;

@WebServlet(name = "cs", urlPatterns = {"/Controleur"}) /*localhost:8080/nomprojetweb/controler*/
public class ControleurServlet extends HttpServlet{
@EJB
	private IBibLocal metier;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Vuebiblio.jsp").forward(request, response); /*appel de localhost*/
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action.equals("Consulter"))
		{
			Long ID_livre=Long.parseLong(request.getParameter("code"));
			request.setAttribute("code", ID_livre);
			Livre L = metier.consulterLivres(ID_livre);
			request.setAttribute("Livre", L);
		}
		else {
			request.setAttribute("Livre", metier.consulterLivres());
		}
		doGet(request, response);
	}
}
