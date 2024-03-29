public class Car {
    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
        System.out.println("Car(name,model)");
    }

    public Car() {
        System.out.println("Car()");
    }
    public Car(String name) {
        this.name = name;
        System.out.println("Car()");
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
