package lk.ijse.dep10.jstl;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        /*Creating the object here according to the model view controller method we create models in either controllers or in
        servlets*/
        Student s1 = new Student(1,"Tharuka");

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setAge(30);
        user.setAdmin(true);

        request.setAttribute("s1", s1);
        request.setAttribute("user", user);

        //Adding an array to the  requests
        List<Student> studentList = Arrays.asList(new Student(1, "Tharuka"), new Student(2, "pasindu"), new Student(3, "Sandeepani"));
        request.setAttribute("studentList", studentList);




        RequestDispatcher requestDispatcher = request.getRequestDispatcher("my.jsp");
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}