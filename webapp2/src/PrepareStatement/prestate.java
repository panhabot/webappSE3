package PrepareStatement;
import java.sql.*;
import java.util.Scanner;

public class prestate {
    public static void main( String[] args ) {
        int num = 0;
        String id = "";
        String name = "";
        Scanner input = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");

            PreparedStatement ps = con.prepareStatement("insert into b6c values(?,?)");


            System.out.println("Enter the number to insert: ");
            num = input.nextInt();
            for (int i=0; i < num ; i ++){
                System.out.println("Enter Id: ");
                id = input.next();
                System.out.println("Enter name: ");
                name = input.next();

                ps.setString(1, id);
                ps.setString(2,name);

                ps.addBatch();
            }
            ps.executeBatch();
            ps.close();
            con.close();

            System.out.println("success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

//addBatch() is using for more efficient than execute() if you have to input lot of input and also it is for security as well
// - Performance
// - Security