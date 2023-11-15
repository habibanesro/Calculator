package codePackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AdditionServlet
 */
/**
     * @see HttpServlet#HttpServlet()
     */
//	@WebServlet("/AdditionServlet")
	public class AdditionServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        int num1 = Integer.parseInt(request.getParameter("num1"));
	        int num2 = Integer.parseInt(request.getParameter("num2"));

	        int result = num1 + num2;

	        response.getWriter().println("Result of Addition: " + result);
	    }
	}
