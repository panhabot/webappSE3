import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBOperation {
    Connection con = null;
    public Connection getCon() throws ClassNotFoundException, SQLException {
        if (con == null){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bs2","root","");
        }
        return con;
    }

    public boolean insertRecord(Student s) throws SQLException, ClassNotFoundException {
        int id = s.getId();
        String name = s.getName();
        getCon();
        PreparedStatement ps  = con.prepareStatement("insert into btb values(?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.execute();
        return true;
    }

    public int insertMultipleRecord(List<Student> studentList) throws SQLException, ClassNotFoundException {
        int count = 0;
        getCon();
        PreparedStatement ps = con.prepareStatement("insert into btb values(?,?)");
        for (Student student:studentList){
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.addBatch();
            count++;
        }
        ps.executeBatch();
        return count;
    }
}
