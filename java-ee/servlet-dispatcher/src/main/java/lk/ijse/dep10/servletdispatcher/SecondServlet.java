package lk.ijse.dep10.servletdispatcher;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value ="/second" )
public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        writer.println("<h1>Hi, "+name+ " Welcome to the Servelts</h1>");

        String color =(String) req.getAttribute("color");

        writer.println(color);

        writer.println("<a href=\"third\">Hello Servlet</a>");
        System.out.println("The request is dispatched from the second servlet");
        writer.println("<h1>Hello This from the second Servlet</h1>");



    }
}
