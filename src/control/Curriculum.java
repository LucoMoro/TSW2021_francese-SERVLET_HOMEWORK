package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Curriculum")
public class Curriculum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter txt;
	txt=response.getWriter();
	response.setContentType("text/html");
	String nome=request.getParameter("nome");
	String cognome=request.getParameter("cognome");
	String indirizzo=request.getParameter("indirizzo");
	String attlav=request.getParameter("attivitalav");
	String[] compinf= request.getParameterValues("compinf");
	String altrecomp= request.getParameter("altrecomp");
	String lingcon= request.getParameter("lingcon");
	String conling= request.getParameter("conling");
	
	txt.print(" nome " + nome + "<br>" );
	txt.print(" cognome " + cognome + "<br>");
	txt.print(" indirizzo " + indirizzo + "<br>");
	txt.print(" attività lavorativa " + attlav + "<br>");
	txt.print ("le competenze di informatica sono " + "<br>");
	for(int i=0; i<compinf.length; i++) {
		txt.print(compinf[i] + "<br>");}
	txt.print(" altre competenze " + altrecomp + "<br>" );
	txt.print(" lingua conosciuta " + lingcon + "<br>" );
	txt.print(" livello " + conling + "<br>" );
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
