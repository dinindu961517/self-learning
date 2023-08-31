public class LazySingleton {
    private static LazySingleton lazySingleton;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return (lazySingleton == null) ? lazySingleton= new LazySingleton() : lazySingleton;
    }
}
