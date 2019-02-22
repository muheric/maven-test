package com.muheric.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Testing")
public class Testing extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
    
    public Testing() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String message = "Au revoir";
		request.setAttribute("variable", message);
		
		/* String salutation = "Jour"; */
		request.setAttribute("salutation", "soir");
		/*
		 * response.setContentType("text/html"); response.setCharacterEncoding("UTF-8");
		 * PrintWriter out = response.getWriter(); out.println("Bonjour Muheto");
		 */
		this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
