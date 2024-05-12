
import java.io.IOException;
import java.sql.*;

public class Main
{
    public static void main(String[] args) throws SQLException,IOException {
        
        try
        {
        String url = "jdbc:mysql://localhost:3306/sqll";
        String user = "root";
        String passwd = "root";
        // String q = "create table emp(id int,name text)";
        // String q = "insert into emp values(1,'java')";
        //    String q = "select * from emp";
            String q = "insert into emp values(?,?)";



        Connection con = DriverManager.getConnection(url, user, passwd);
        
        PreparedStatement p = con.prepareStatement(q);

        p.setInt(1, 2);
        p.setString(2, "python");
        p.executeUpdate();

        // Statement stm = con.createStatement();
        //  ResultSet rst = stm.executeQuery(q);

        //     while (rst.next()) {

        //         System.out.println(rst.getInt(1));
        //         System.out.println(rst.getString(2));    
        //     }
            
            con.close();

        System.out.println("Connection successfully");


        }
        catch(Exception e)
        {
                System.out.println(e.getMessage());
        }

    }
}