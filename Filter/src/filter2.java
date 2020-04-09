import javax.servlet.*;
import java.io.IOException;

public class filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 2 created....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before doFilter in Filter two");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After chaining filter 2");
    }
    @Override
    public void destroy() {
        System.out.println("Filter two destroy....");
    }
}
