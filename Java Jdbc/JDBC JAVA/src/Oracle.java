import java.sql.*;

public class Oracle {
    public static void main(String[] args) {
        try
        {
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

            String q = "create table vscode(id number primary key,vsnmae varchar(20))";
            String q1 = "insert into vscode values(?,?)";
            String q2 = "alter table vscode drop column vsdate ";
            String q3 = "select * from vscode ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q3);

            while (rs.next()) {
                System.out.println("id "+ rs.getInt(1));
                System.out.println("Name "+ rs.getString(2));
            }

            // PreparedStatement ps = con.prepareStatement(q1);
            // ps.setInt(1, 3);
            // ps.setString(2, "gamer");
            // ps.executeUpdate();


            
            System.out.println("connected");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
