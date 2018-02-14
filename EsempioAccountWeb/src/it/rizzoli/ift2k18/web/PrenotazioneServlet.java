package it.rizzoli.ift2k18.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class PrenotazioneServlet
 */
@WebServlet("/prenotazione")
public class PrenotazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrenotazioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(
//						request.getInputStream())
//				);
//		String json = "";
//		String letto = br.readLine();
//		while(letto != null) {
//			json += letto;
//			letto = br.readLine();
//		}
		ObjectMapper mapper = new ObjectMapper();
		PrenotazioneViewModel p = mapper.readValue(request.getInputStream(), PrenotazioneViewModel.class);
		//System.out.println(p);
		
		response.getWriter().append("ok");
	}

}
