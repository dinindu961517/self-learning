public class MyClass3 {
    static int x=10;
    static int y=20;
    static {
        System.out.println(x+y);
    }
    {
        System.out.println(x+y);
    }
    public MyClass3() {
        x=500;
        int y=600;
    }
    public MyClass3(int x) {

        this.x = x;
    }
    public static void print() {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        x=100;
        print();
        MyClass3 obj = new MyClass3(1);
        MyClass3.print();
        System.out.println(obj.x+obj.y);
        MyClass3 obj2 = new MyClass3();
        MyClass3.print();
        System.out.println(obj.x+obj.y);



    }
}
