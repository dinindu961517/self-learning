import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://dep10.lk:3306/dep10_pos", "root", "mysql");
            Statement stm = connection.createStatement();
            ResultSet rs3= stm.executeQuery("SELECT * from item");
            while (rs3.next()) {
                System.out.println(rs3.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
