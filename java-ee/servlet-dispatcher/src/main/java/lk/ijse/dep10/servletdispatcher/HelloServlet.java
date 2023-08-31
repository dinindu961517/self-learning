package lk.ijse.dep10.servletdispatcher;

import java.io.*;

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
    }

    public void destroy() {
    }
}