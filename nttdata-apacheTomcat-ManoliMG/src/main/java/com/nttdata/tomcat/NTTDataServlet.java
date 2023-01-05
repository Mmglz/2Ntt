package com.nttdata.tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Primer Servlet Dual
 * 
 * @author manoli
 */
public class NTTDataServlet extends HttpServlet {
	
	/** Serial version **/
	private static final long serialVersionUID = 1L;

	/**
	 * Contructor por defecto.
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public NTTDataServlet() {
		super();
	}

	/**
	 * Método que escucha peticiones HTTP con método GET.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("NTT DATA | GET | Primer Servlet Ok ");
	}

	/**
	 * Método que escucha peticiones HTTP con método POST.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("NTT DATA | POST | Primer Servlet Ok ");
	}

}
