public class Student {
    private int stId;
    private String name;
    private String address;
    private Teacher teacher;

    public Student(int stId, String name, String address) {
        this.stId = stId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stId=" + stId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
