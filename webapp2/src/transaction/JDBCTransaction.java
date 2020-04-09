package transaction;

import java.sql.*;
import java.util.*;

public class JDBCTransaction {
    public static void main( String[] args ){
        new JDBCTransaction().transaction();
    }

    public void transaction(){
        Connection con = null;
        Statement st = null;

        Scanner input = new Scanner(System.in);

        int debID = 0;
        int amt = 0;
        int creID = 0;

        try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Transaction","root","");
         con.setAutoCommit(false);


            System.out.println("Enter id to debit money: ");
            debID = input.nextInt();

            System.out.println("Enter the amount to be debit: ");
            amt = input.nextInt();

            System.out.println("Enter the account to credit money: ");
            creID = input.nextInt();
            st = con.createStatement();

            st.executeUpdate("update bank set amount = amount - '"+amt+"' where id = '"+debID+"' ");
            st.executeUpdate("update bank set amount = amount + '"+amt+"' where id = '"+creID+"' ");
            con.commit();
            System.out.println("Transaction Completed thank you for using our bank");

        } catch (Exception e) {
            e.printStackTrace();
//        } catch (SQLException e){
//            try{
//                con.rollback();
//                System.out.println("Error transaction");
//            }catch (SQLException ex){
//                System.out.println("roll back failed");
//            }
        }
    }
}
