import java.io.IOException;
import java.sql.SQLException;

public class MyClass2 {
    public static void myMethod() throws SQLException{
        System.out.println("This is myMethod()");
        throw new SQLException();
    }

    public static void myMethod2() throws SQLException {
        System.out.println("This is myMethod2()");
        myMethod();
    }
}
