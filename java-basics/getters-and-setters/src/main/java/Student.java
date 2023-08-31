public class Student extends Object {
    private String id;
    private String name;
    private Address address;

//    public Student(String id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = "S"+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
