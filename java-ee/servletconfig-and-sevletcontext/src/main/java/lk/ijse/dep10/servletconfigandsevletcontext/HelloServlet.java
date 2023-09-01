package lk.ijse.dep10.servletconfigandsevletcontext;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");


        //To get the context params
        ServletContext context = getServletContext();
        String name = context.getInitParameter("name");
        String age = context.getInitParameter("age");

        out.println("<h1>"+name+"</h1>");
        out.println("<h1>"+age+"</h1>");

        //to get the values from the servlet config params
        ServletConfig servletConfig = getServletConfig();
        String name1 = servletConfig.getInitParameter("name");
        out.println("<h1>"+name1+"</h1>");
    }

    public void destroy() {
    }
}