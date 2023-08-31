import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Prius extends Car implements Externalizable {
    private String color;

    public Prius(String name, String model, String color) {
        super(name, model);
        this.color = color;
        System.out.println("Prius(name,model,color)");
    }

    public Prius(String name) {
        super(name);
        System.out.println("Prius(name)");
    }

    public Prius() {
        System.out.println("Prius()");
        //This no-Arg constructor is compulsory for Externalizable
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getName());
        //Here I have only serialized the name variable
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setName(in.readObject().toString());
        //And I have only deserialized the name variable too
    }
}
