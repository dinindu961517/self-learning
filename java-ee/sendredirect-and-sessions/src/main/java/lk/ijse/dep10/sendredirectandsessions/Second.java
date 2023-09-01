package lk.ijse.dep10.sendredirectandsessions;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Second", value = "/second")
public class Second extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "Dinidu";

        //Sending the data in sendRedirect()
//        response.sendRedirect("third?name="+name); //We can send data in sendRedirect in this way, but it is not recommended


        //Getting the session
        HttpSession session = request.getSession();

        //Setting an attribute
        session.setAttribute("name",name);
        //Redirecting the response
        response.sendRedirect("third");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
