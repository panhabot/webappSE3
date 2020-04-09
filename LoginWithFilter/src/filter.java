import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Created...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try{
        HttpServletRequest hsr = (HttpServletRequest) servletRequest;
        HttpSession hs = hsr.getSession();
        Boolean flag = (boolean) hs.getAttribute("flag");
        if (flag){
            filterChain.doFilter(servletRequest,servletResponse);
        }
        }catch (Exception e){
            RequestDispatcher rd = servletRequest.getRequestDispatcher("index.jsp");
            rd.forward(servletRequest,servletResponse);
            e.printStackTrace();
        }

    }

    @Override
    public void destroy() {

    }
}
