import java.io.*;

public class Vehicle implements Serializable, Externalizable {

    String name;
    String model;
    String color;

    public Vehicle(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
        System.out.println("Vehicle(name,model,color)");
    }

    public Vehicle() {
        System.out.println("Vehicle()");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(color);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name =(String) in.readObject();
        model = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
