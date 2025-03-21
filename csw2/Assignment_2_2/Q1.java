package Assignment_2_2;
class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Pair{key=" + key + ", value=" + value + "}";
    }
}

public class Q1 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        Pair<Integer, String> p2 = new Pair<>(1, "John");
        Pair<String, Double> p3 = new Pair<>("Price", 19.99);
        
        System.out.println("Pair 1 - Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Pair 2 - Key: " + p2.getKey() + ", Value: " + p2.getValue());
        System.out.println("Pair 3 - Key: " + p3.getKey() + ", Value: " + p3.getValue());

        p1.setValue(30);
        p2.setKey(2);

        System.out.println("\nAfter modifications:");
        System.out.println("Pair 1: " + p1);
        System.out.println("Pair 2: " + p2);
    }
}