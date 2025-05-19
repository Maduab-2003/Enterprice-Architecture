/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetUserInputServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CalculateSumServlet", urlPatterns = {"/CalculateSumServlet"})
public class CalculateSumServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));         
        int sum = num1 + num2;  
 
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculateSumServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The sum of " + num1 + " and " + num2 + " is: " + sum + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
