package com.luv2code.servletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcDemoServlet
 */
@WebServlet("/MvcDemoServlet")// the servlet class MvcDemoServlet is annotated with @WebServlet("/MvcDemoServlet"),
//indicating that it will respond to requests with the URL pattern "/MvcDemoServlet"
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Step 0: Add data
		String[] students = {"Susan", "Anil", "Mohamed", "Trupti"};
		request.setAttribute("student_list", students);// student_list  value
		
		
		// Step 1: get request dispatcher,  commonly used in servlets to forward the request to a JSP page for rendering the response.
//		The JSP page (view_students.jsp in this case) will then process the request, 
//		generate the HTML content, and send it back to the client.
		RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/view_students.jsp");	
					
		// Step 2: forward the request to JSP
dispatcher.forward(request, response);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
