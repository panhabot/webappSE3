import javax.servlet.*;
import java.io.IOException;

public class filer1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter1 is created.... ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before doFilter in Filter one.....");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("After the filter chaining filter one...");
    }

    @Override
    public void destroy() {
        System.out.println("Filter one destroy");
    }
}
