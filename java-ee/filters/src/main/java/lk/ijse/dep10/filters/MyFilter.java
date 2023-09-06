package lk.ijse.dep10.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("THis is my Filter");
        chain.doFilter(request, response);
    }
}
