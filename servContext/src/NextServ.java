import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "NextServ")
public class NextServ extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        HttpSession hs = request.getSession();

        hs.setAttribute("user", user);
        hs.setAttribute("user", "bot");
        hs.removeAttribute("user");


        ServletContext ctx = getServletContext();
        ctx.setAttribute("school", "KIT");
        ctx.setAttribute("school", "rupp");
        ctx.removeAttribute("school");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
