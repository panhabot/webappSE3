package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBOperation {
    private Connection con = null;
    private Statement st = null;

    public void getStatement()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jbdc:mysql://localhost:3306/bs2","root","");
        st = con.createStatement();
        System.out.println("Connected successfully");
    }

    public void insertData( ArrayList<btb> btb ){
        try{
            for (btb x : btb){
                getStatement();
                st.execute("insert into btb values ('"+ x.getId() +"','"+x.getName()+"')");
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
