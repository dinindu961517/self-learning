package lk.ijse.dep10.servletdispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/fourth",name = "fourthServlet")
public class FourthServlet extends HelloServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("The request is dispatched from the fourth servlet");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello This from the fourth Servlet</h1>");
    }
}
