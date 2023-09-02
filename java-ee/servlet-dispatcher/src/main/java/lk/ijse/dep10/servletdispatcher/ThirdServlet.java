package lk.ijse.dep10.servletdispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/third",name = "thirdServlet")
public class ThirdServlet extends HelloServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Getting the nameDispatcher
        RequestDispatcher requestDispatcher = req.getServletContext().getNamedDispatcher("fourthServlet");
        requestDispatcher.include(req,resp);
        System.out.println("The request is dispatched from the third servlet");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Hello This from the third Servlet</h1>");
    }
}
