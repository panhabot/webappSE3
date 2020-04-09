import javax.servlet.*;
import java.io.IOException;

public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter created...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        int usd = Integer.parseInt(servletRequest.getParameter("usd"));
        if (usd < 0){
            RequestDispatcher rd = servletRequest.getRequestDispatcher("error.jsp");
            rd.include(servletRequest,servletResponse);
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy....");
    }
}
