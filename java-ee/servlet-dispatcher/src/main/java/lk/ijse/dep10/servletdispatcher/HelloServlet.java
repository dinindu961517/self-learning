package lk.ijse.dep10.servletdispatcher;

import java.io.*;

import com.sun.security.jgss.GSSUtil;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String color = "Yellow";
        request.setAttribute("color", color); // we can pass values like this

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("second");
//        requestDispatcher.include(request, response);
        requestDispatcher.forward(request,response);
        System.out.println("The request is dispatched from the hello servlet");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello This from the Hello Servlet</h1>");
    }

    public void destroy() {
    }
}