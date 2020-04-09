package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class cs {
    public static void main( String[] args ) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");

        CallableStatement cs = con.prepareCall("{call insertR(?,?)}");
        cs.setInt(1,12);
        cs.setString(2,"bot");
        cs.execute();

        System.out.println("Program end....");
    }
}
