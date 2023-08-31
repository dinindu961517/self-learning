import java.util.Date;

class Time extends Object{
    int hours;
    int minutes;
    int seconds;

    public Time() {
        this(0, 0, 0);
    }
    public Time(int hours) {
        this(hours, 0, 0);
    }
    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("All arg Constructor");
    }

    public void print() {
        System.out.println(hours+":"+minutes+":"+seconds);
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(19, 42, 20);
        Time time3 = new Time(19);
        Time time4 = new Time(19, 42);

        time1.print();
        time2.print();
        time3.print();
        time4.print();

//        Date date1 = new Date();
//        System.out.println(date1);
//        Date date2 = new Date(2023, 06, 24);
//        Date
//        System.out.println(date2);
    }




}
