import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServ")
public class LoginServ extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Boolean flag = false;
        String username = request.getParameter("user");
        String password = request.getParameter("password");

        if ( username.equals("bot") && password.equals("1234")){
            HttpSession hs = request.getSession();
            hs.setAttribute("flag", true);
            RequestDispatcher rd = request.getRequestDispatcher("SuccessServ");
            rd.forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
