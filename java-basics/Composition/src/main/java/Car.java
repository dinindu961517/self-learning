public class Car {
    private final String name;
    private final Engine engine; // Composition.

    public Car(String name, String type, int horsePower){
        this.name = name;
        this.engine = new Engine(type, horsePower);
    }
    public String getName(){
        return name;
    }
    public Engine getEngine(){
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
