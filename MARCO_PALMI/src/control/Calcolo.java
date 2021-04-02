package control;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calcolatore;

@WebServlet("/Calcolo")
public class Calcolo extends HttpServlet 
{	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<head><title> Risultato Inaspettato! </title></head>");
		
		String b = request.getParameter("base");
		double base = Double.parseDouble(b);
		
		String h = request.getParameter("altezza");
		double altezza = Double.parseDouble(h);
		
		if(base<0 || altezza<0) out.print("Allora sei stronzo");
		
		Calcolatore c = new Calcolatore(base,altezza);
		
		double area = c.getArea();
		
		out.print("L'area è stata calcolata, essa è pari a <br>" + area);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



