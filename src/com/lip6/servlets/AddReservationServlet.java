package com.lip6.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.services.ServiceReservation;

public class AddReservationServlet extends HttpServlet {

	private static final long serialVersionUID = 1172021542352677229L;

	public AddReservationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		ServiceReservation serviceVoyageur = (ServiceReservation) context.getBean("ServiceReservation");
		if (request.getParameter("button").equals("Add Voyageur")){
			serviceVoyageur.addVoyageur(request.getParameter("civilite"),request.getParameter("nom"),
					request.getParameter("prenom"), request.getParameter("email"),
					request.getParameter("numeroPieceIdentite"),Integer.parseInt(request.getParameter("age")));
		} else if (request.getParameter("button").equals("Validate Reservation")){
			serviceVoyageur.addReservation1();
		}
		response.sendRedirect("CreateReservation-servlet.jsp");
	}

}
