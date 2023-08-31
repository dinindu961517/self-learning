public class Demo {
    public static void main(String[] args) {
        Address address = new Address();
        address.setNo(1);
//        System.out.println(address.getNo());

//        Address address1 = new Address(1, "Second Lane", "New York");
//        System.out.println(address1);
//        String myStr = "Chethini";
//        System.out.println(myStr);
        Student chethini = new Student();
        chethini.setId(1);
        chethini.setName("Chethini");
        chethini.setAddress(address);
        System.out.println(chethini);
    }
}
