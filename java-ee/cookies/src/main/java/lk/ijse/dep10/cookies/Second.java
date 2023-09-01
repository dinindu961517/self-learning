package lk.ijse.dep10.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Second", value = "/second")
public class Second extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookie = request.getCookies();

        response.getWriter().println("Here is my cookie :"+cookie[0].getValue());
        for (Cookie cookie1 : cookie) {
            System.out.println(cookie1.getName()+": "+ cookie1.getValue());
        }

        //To read a cookie value
        for (Cookie cookie1 : cookie) {
            if (cookie1.getName().equals("name")) {
                String name = cookie1.getValue();
                response.getWriter().println("<h1>"+name+"</h1>");
            }
        }

        //To delete a cookie
        /*To delete a cookie on the client's side, you can create a new cookie with the s
        ame name and set its maxAge attribute to 0. Then, add this cookie to the response,
        which effectively tells the client to remove the cookie.
         */
        Cookie deleteCookie = new Cookie("username", "");
        deleteCookie.setMaxAge(0);
        response.addCookie(deleteCookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
