import java.sql.*;
public class TestCreateTableproduct
{
    public static void main(String args[])
    {
       try
         {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
             Statement stmt=con.createStatement();
           stmt.execute("create table product(product_id number(2),product_name varchar(22),product_price number(33))");
           System.out.println("product table create sucessfully");
           }
         catch(Exception e)
         {
              System.out.println(e);
         }
      }
} 