public class Demo {
    public static void main(String[] args) {
        Address address1 = new Address(17, "First Lane", "London");
        Address address2 = new Address(11, "Unity Place", "Stoke City");

        Student student1 = new Student(1, "Roy", address1);
        Student student2 = new Student(2, "Joy", address2);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(address1);
        System.out.println(address2);
    }

}
