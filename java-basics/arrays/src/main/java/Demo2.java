import java.sql.*;

public class Demo2 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://dep10.lk:3306/dep10_pos", "root", "mysql");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                int i=1;
                System.out.println(rs.getString(i));
                i++;
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
