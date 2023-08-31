public class Main {
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();

        System.out.println(obj1 == obj2);

        EagerSingleton obj3 = EagerSingleton.getInstance();
        EagerSingleton obj4 = EagerSingleton.getInstance();
        System.out.println(obj3 == obj4);

    }
}
