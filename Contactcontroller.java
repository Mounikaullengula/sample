package com.agilecrm.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agilecrm.dao.daoimp;
import com.agilecrm.model.Contact;
/**
 * Servlet implementation class Contactcontroller
 */
public class Contactcontroller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
   
    public Contactcontroller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    boolean status;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("this is get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("this is post");
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String mail=request.getParameter("email");	
		Contact c=new Contact();
		c.setFirstName(fname);
		c.setLastName(lname);
		c.setEmail(mail);
		daoimp d=new daoimp();
		status=d.createContact(c);
		if(status)
			out.println("updated");
		else
		out.println("failed");
			
	}

}
