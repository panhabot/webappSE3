import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ValidateServlet")
public class ValidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sno = Integer.parseInt(request.getParameter("sno"));
        String name = request.getParameter("name");

        Student s = new Student();
        s.setId(sno);
        s.setName(name);

        DBOperation dbop = new DBOperation();
        try {
            if(dbop.insertRecord(s)){
                System.out.println("Data inserted successfully");
                request.setAttribute("student", s);
            }else System.out.println("Data insertion failed...");
            RequestDispatcher rd =  request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
