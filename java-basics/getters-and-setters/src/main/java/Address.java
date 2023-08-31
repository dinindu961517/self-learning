public class Address {
    private int no;
    private String laneNumber;
    private String city;

    public Address(int no, String laneNumber, String city) {
        this.no = no;
        this.laneNumber = laneNumber;
        this.city = city;
    }

    public Address() {
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public String getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(String laneNumber) {
        this.laneNumber = laneNumber;
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
                ", laneNumber='" + laneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
