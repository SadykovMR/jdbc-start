import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Start {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection conn=DriverManager.getConnection("jdbc:h2:/file");
            Statement statement = conn.createStatement();
            statement.execute("create table tab(name varchar2(20))");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
