package it.rizzoli.ift2k18.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.rizzoli.ifts2k18.Utente;
import it.rizzoli.ifts2k18.business.EsitoOperazione;
import it.rizzoli.ifts2k18.business.GestioneAccount;

/**
 * Servlet implementation class RegistrazioneUtenteServlet
 */
@WebServlet("/registraUtente")
public class RegistrazioneUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private GestioneAccount ga = new GestioneAccount();
	private ObjectMapper mapper = new ObjectMapper();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneUtenteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = convertStreamToString(request.getInputStream());
		Utente u = mapper.readValue(data, Utente.class);
		EsitoOperazione eo = ga.registraUtente(u);
		
		String json = mapper.writeValueAsString(eo);
		response.setContentType("application/json");
		response.getWriter().append(json);
	}

	static String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
}
