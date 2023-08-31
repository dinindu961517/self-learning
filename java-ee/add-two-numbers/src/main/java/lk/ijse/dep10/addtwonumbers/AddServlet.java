package lk.ijse.dep10.addtwonumbers;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class AddServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Welcome to the results</h1> <br><br>");
        writer.println("<h3>Result is : "+result + "</h3>");

    }

    public void destroy() {
    }
}