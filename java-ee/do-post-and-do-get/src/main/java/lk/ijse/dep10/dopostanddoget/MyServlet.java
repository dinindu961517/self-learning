package lk.ijse.dep10.dopostanddoget;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>This is the result of "+num1+ " + "+num2+ " = "+(num1+num2)+ "</h1>");
        writer.println();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>This is the result of "+num1+ " * "+num2+ " = "+(num1*num2)+ "</h1>");
        writer.println();
    }
}
