package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calcolo;

@WebServlet("/Rettangolo")
public class Rettangolo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter txt;
		txt=response.getWriter();
		response.setContentType("text/html");
		String base=request.getParameter("base");
		String altezza=request.getParameter("altezza");
		
		double b;
		double h;
		b=Double.parseDouble(base);
		h=Double.parseDouble(altezza);
		
		Calcolo calcolo= new Calcolo(b,h);
		
		double area=calcolo.getArea();
		
		txt.print("l'area avente base" + b + " e altezza " + h + " ha area pari a " + area );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
