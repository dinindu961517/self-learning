public class Address {
    int no;
    String laneName;
    String city;

    public Address(int no, String laneName, String city) {
        this.no = no;
        this.laneName = laneName;
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLaneName() {
        return laneName;
    }

    public void setLaneName(String laneName) {
        this.laneName = laneName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "no=" + no +
                ", laneName='" + laneName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
