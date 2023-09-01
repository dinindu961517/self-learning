package lk.ijse.dep10.requestandrepsonse;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/test")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Request
        //getParameter()
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name);
        System.out.println(age);
        //getHeader
        String host = request.getHeader("Host");
        System.out.println(host);

        //setAttribute
        String nickName = "Bin";
        request.setAttribute("nickName", nickName);

        //getMethod
        String method = request.getMethod();
        System.out.println(method);

        RequestDispatcher second = request.getRequestDispatcher("second");
        second.forward(request, response);


        //Response
        //Set status
        response.setStatus(200);

        //Set contentType
        response.setContentType("text/plain");

    }

    public void destroy() {
    }
}