package com.univ.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SesDemo
 */
@WebServlet("/SesDemo")
public class SesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs =request.getSession(true);
		PrintWriter pw = response.getWriter();
		Integer i =(Integer)hs.getAttribute("key");
		if (i==null) {
			pw.println("You are visiting 1 time");
			hs.setAttribute("key", 1);
			
		}else {
			int x = i;
			 x = x+1;
			pw.println("You are visiting " + x + " Time");
			hs.setAttribute("key", x);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
