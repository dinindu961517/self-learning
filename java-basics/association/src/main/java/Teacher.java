import java.util.Arrays;
import java.util.List;

public class Teacher {
    private int Id ;
    private String name;
    private String address;
    private List<Student> studentList;

    public Teacher(int id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
