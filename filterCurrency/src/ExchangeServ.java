import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ExchangeServ")
public class ExchangeServ extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String curType = request.getParameter("curType");
        float usd = Float.parseFloat(request.getParameter("usd"));
        PrintWriter out = response.getWriter();
        if (curType.equals("INR"))
            out.println(usd * 71.22 + " Rupee");
        else if (curType.equals("KHR"))
            out.println(usd * 4000 + " riel");
        else if (curType.equals("YUAN"))
            out.println(usd * 7 + " Chinese Yuan");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
