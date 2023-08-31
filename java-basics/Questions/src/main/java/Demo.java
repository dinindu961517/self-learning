public class Demo {
    public static void main(String[] args) {
        System.out.printf("%.3f",Math.PI);
        System.out.println();
        System.out.printf("\u001B[31m(%1$d)\u001B[37m %2$d-%3$d",123,456,7890);
        System.out.println();
        System.out.printf("\u001B[31m%1$d/\u001B[32m%2$d/\u001B[33m%3$d \u001B[34m%4$d:\u001B[35m%5$d:\u001B[36m%6$d",25,12,2023,23,59,59);
        System.out.println();
        System.out.printf("\u001B[32m%1$d-\u001B[34m%2$d-\u001B[35m%3$d-\u001B[36m%4$d",978,3,16,1484100);
        System.out.println();
        System.out.printf("\u001B[0m\u001b[41m[%1$10d\u001B[30m\u001b[42m%2$-10s]",5,"0%");
    }
}
