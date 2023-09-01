package lk.ijse.dep10.sendredirectandsessions;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Third", value = "/third")
public class Third extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("name");



        //Session
        HttpSession session = request.getSession();
        String myName =(String) session.getAttribute("myName");
        String name = (String) session.getAttribute("name");


        //Writer
        PrintWriter writer = response.getWriter();
        writer.println("<h1>This is done by sendRedirect()</h1>");
        writer.println("<h1>Hi,"+name+"</h1>");
        writer.println("<h1>Hi,"+myName+"</h1>");

        // Retrieving all attribute names in the session
        Enumeration<String> attributeNames = session.getAttributeNames();

        // Loop through attribute names and retrieve values
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            Object attributeValue = session.getAttribute(attributeName);
            response.getWriter().write(attributeName + ": " + attributeValue + "\n");
        }

        writer.println("<form action=\"sessions\">\n" +
                "    Enter your name : <input type=\"text\" name=\"name\">\n" +
                "    \n" +
                "    <input type=\"submit\">\n" +
                "</form>");
        writer.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
