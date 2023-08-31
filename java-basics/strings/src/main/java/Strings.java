public class Strings {
    public static void main(String[] args) {
        String myStr1 = "Chethini";
        String myStr2 = new String("Chethini");
        String myStr3 = new String("Chethini").intern();
        String myStr4 = "Chethini";

        System.out.println(myStr1 == myStr2);
        System.out.println(myStr1 == myStr3);
        System.out.println(myStr1 == myStr4);
    }
}
