package in.soa.beans;
public class Bike implements Vehicle {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void start() {
        System.out.println("Bike " + name + " (" + id + ") is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bike " + name + " (" + id + ") is stopping...");
    }
}