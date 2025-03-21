package Assignment_2;
public class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return type + " " + color + " " + name;
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", "Brown", "pet");
        Animal cat = new Animal("Whiskers", "White", "pet");
        Animal tiger = new Animal("Shere Khan", "Orange", "wild");
        Animal wolf = new Animal("Lobo", "Gray", "wild");
        Animal sameDog = new Animal("Buddy", "Brown", "pet");

        System.out.println("Animal 1: " + dog + " - HashCode: " + dog.hashCode());
        System.out.println("Animal 2: " + cat + " - HashCode: " + cat.hashCode());
        System.out.println("Animal 3: " + tiger + " - HashCode: " + tiger.hashCode());
        System.out.println("Animal 4: " + wolf + " - HashCode: " + wolf.hashCode());
        System.out.println("Animal 5: " + sameDog + " - HashCode: " + sameDog.hashCode());
    }
}