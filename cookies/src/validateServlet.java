import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "validateServlet")
public class validateServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        if(name.trim().equals("Dane")){
            Cookie nameCookie = new Cookie("name",name);
            response.addCookie(nameCookie);
            Cookie emailCookie = new Cookie("email", email);
            response.addCookie(emailCookie);

            PrintWriter out = response.getWriter();
            out.println("Hi Dane.....");
        }else{
            PrintWriter out = response.getWriter();
            out.println("Ice Tea.....");
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
