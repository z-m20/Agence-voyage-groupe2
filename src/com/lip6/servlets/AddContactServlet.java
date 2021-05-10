package com.lip6.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.daos.DAOContact;
import com.lip6.daos.IDAOContact;
import com.lip6.entities.Contact;
import com.lip6.services.ServiceContact;

/**
 * Servlet implementation class AddContactServlet
 */
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IDAOContact dao=new DAOContact();
		dao.testConfig();

//		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//		
//		String[] allBeanNames = context.getBeanDefinitionNames(); //afficher tous les beans dans l'annuaire de Spring
//		for(String beanName : allBeanNames) 
//		{
//			System.out.println(beanName + "******************");
//		}
//		
//		Contact c = (Contact)context.getBean("contact");
//		ServiceContact sc = (ServiceContact)context.getBean("ServContact");
//		
//		sc.addContact(c);
//
//		//long id = Long.parseLong(request.getParameter("id")); //cast
//		String fname = request.getParameter("fname");
//		String lname = request.getParameter("lname");
//		String email = request.getParameter("email");
//
//		IDAOContact dao =(IDAOContact)context.getBean("RepDAO");
//		dao.addContact("Xavier", "Blanc", "Test@mail.com");
//
//		//Contact c = (Contact)context.getBean("contact");
//
//		//ServiceContact sc = new ServiceContact();
//
//		sc.addContact(fname, lname, email); //formulaire rentré sur le site 
//		//sc.addContact(c.getFirstName(), c.getLastName(), c.getEmail()); //valeurs entrées à la dure dans AppContext
//
//		System.out.println(c);
	}


}
