package lk.ijse.dep10.sendredirectandsessions;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.util.Enumeration;

@WebServlet("/sessions")
public class SessionsServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response) {
        //To get the session
        HttpSession session = req.getSession();

        //Retrieve date from the session attribute
        Enumeration<String> attributeNames = session.getAttributeNames();

        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            String attributeValue =(String) session.getAttribute(attributeName);
        }

        //To set a value to sessions
        session.setAttribute("color", "blue");

        //To remove a value from the session
        session.removeAttribute("name");

        //To invalidate a session
        session.invalidate();

        //To timeout a session
        session.setMaxInactiveInterval(450);

    }
}
