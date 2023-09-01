package lk.ijse.dep10.cookies;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/my")
public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //Create a cookie
        Cookie cookie = new Cookie("name", "Dinindu");

        cookie.setMaxAge(1000);

        //Add cookie to the response
        res.addCookie(cookie);

        res.sendRedirect("second");
    }
}
