import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class filter1 implements Filter {
    FilterConfig config;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = config;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        String s = config.getInitParameter("contruction");

        if(s.equals("yesr")){
            out.println("This page is under construction");
        }
        else
        {
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
