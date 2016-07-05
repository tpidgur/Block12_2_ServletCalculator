package ua.com.epam.demo.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try( Writer out = response.getWriter() ){
			out.write("Hello!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
	String c=request.getParameter("c");
	double a = Double.valueOf(request.getParameter("a"));
	double b = Double.valueOf(request.getParameter("b"));
	double res=0;
		if (c.equals("+")){
			res=a+b;
			try( Writer out = response.getWriter() ){
			out.write(a+"+"+b+"="+(res));
		}	
			}	else	if (c.equals("-")){
				res=a-b;
				try( Writer out = response.getWriter() ){
				out.write(a+"-"+b+"="+(res));
			}
				} else if (c.equals("*")){
				res=a*b;
				try( Writer out = response.getWriter() ){
				out.write(a+"*"+b+"="+(res));
			}} else {
				res=a/b;
				try( Writer out = response.getWriter() ){
				out.write(a+"/"+b+"="+(res));
			}
				
		}
		
	
		
		
	}

}
