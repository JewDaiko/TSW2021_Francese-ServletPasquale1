
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Curriculum")
public class Curriculum extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		out.print("Nome :" + nome + "<br>");
		String cognome = request.getParameter("cognome");
		out.print("Cognome : " + cognome + "<br>");
		String indirizzo = request.getParameter("indirizzo");
		out.print("Indirizzo : " + indirizzo + "<br>" );
		
		String attività = request.getParameter("altro1");
		out.print("Attività : " + attività + "<br>");
		String[] competenze = request.getParameterValues("competenze");
		out.print("Competenze : ");
		for(int i = 0; i<competenze.length; i++)
		{
			if(i!= competenze.length - 1) out.print(competenze[i] + ",");
			else  out.print(competenze[i]);
		}
		out.print("<br>");
		String altro = request.getParameter("altro");
		out.print("Altre Competenze : " + altro + "<br>");
		String lingua = request.getParameter("lingua");
		out.print("Lingua : " + lingua + "<br>");
		String conoscenza = request.getParameter("conoscenza");
		out.print("Conoscenza : " + conoscenza);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}
}
