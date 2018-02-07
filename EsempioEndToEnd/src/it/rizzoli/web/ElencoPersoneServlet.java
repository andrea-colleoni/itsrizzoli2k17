package it.rizzoli.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.rizzoli.ift2k18.JPAUtil;
import it.rizzoli.ift2k18.Persona;

/**
 * Servlet implementation class ElencoPersoneServlet
 */
@WebServlet("/elencoPersone")
public class ElencoPersoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElencoPersoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Persona> elenco = JPAUtil.getEm()
				.createQuery("select p from Persona p", Persona.class)
				.getResultList();
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(elenco);
		response.setContentType("application/json");
		response.getWriter().append(json);
	}

}
