import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int i = 5;
        Status status= Status.RUNNING;
        System.out.println(status);

        //get the number of the enum-ordinal()
        System.out.println(status.ordinal());
        System.out.println(Status.FAILED.ordinal());
        System.out.println(Status.SUCCESS.ordinal());
        System.out.println("--------------------");

        //to get all the objects
        Status[] statuses = Status.values();
        System.out.println(Arrays.toString(statuses));
        System.out.println("--------------");

        //using with switch
        Status s=Status.RUNNING;
        switch (s) {
            case RUNNING:
                System.out.println("All Good");
                break;
            case FAILED:
                System.out.println("Try Again");
                break;
            case PENDING:
                System.out.println("Please Wait");
                break;
            case SUCCESS:
                System.out.println("Done");
                break;
        }
        System.out.println("--------");

        System.out.println(s.name());
        System.out.println("-----------");
        System.out.println(s.getClass().getSuperclass());
    }
}
