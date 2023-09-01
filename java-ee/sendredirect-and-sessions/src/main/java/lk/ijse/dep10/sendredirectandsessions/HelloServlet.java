package lk.ijse.dep10.sendredirectandsessions;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");



        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<form action=\"second\">\n" +
                "    Enter your name : <input type=\"text\" name=\"name\">\n" +
                "    \n" +
                "    <input type=\"submit\">\n" +
                "</form>");
        out.println("</body></html>");
        out.println();



        //Session -Getting the session
        HttpSession session = request.getSession();
        //Setting the attributes
        session.setAttribute("myName", name);
        response.sendRedirect("second");
    }

    public void destroy() {
    }
}