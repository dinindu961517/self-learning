package lk.ijse.dep10.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "HelloFilter",urlPatterns = "/hello-servlet")
public class HelloFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest rq = (HttpServletRequest) request;
        String name = rq.getParameter("name");
        int age = Integer.parseInt(rq.getParameter("age"));
        System.out.println("This is HelloFilter");
        if (age > 0 && age < 100) {
            chain.doFilter(request, response);
        } else {
            PrintWriter writer = response.getWriter();
            writer.println("The age is not a valid input");

        }

    }
}
