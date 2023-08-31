public class Date2 {
    int day=1;
    int month=1;
    int year=2000;

    public Date2(int day, int month, int year) {

        this.day = day;
        month = month;
        this.year = year;
    }

    public Date2() {
    }

    public void showDate() {
        System.out.println(day+":"+month+":"+year);
    }

    public static void main(String[] args) {
        Date2 date1 = new Date2(24, 7, 2023);
        date1.showDate();

    }
}
