package it.rizzoli.ifts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimoServlet") // URL mapping
public class PrimoServlet extends HttpServlet {

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<html><body>");
		for(int i = 0; i < 200; i++) {
			String color = "";
			if (Math.random() > 0.5)
				color = "red";
			else
				color = "green";
			response.getWriter().append("<h2 style=\"color:" + color + "\">Valore di i:" + i + "</h2>");
			response.getWriter().append("<button onclick=\"console.log('pulsante " + i + " di colore " + color + "');\">Cliccami!</button>");
		}
		response.getWriter().append("</body></html>");
	}

}
