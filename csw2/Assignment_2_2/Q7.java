package Assignment_2_2;
import java.util.*;

class Address {
    String plotNo, at, post;
    
    Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    
    public String toString() {
        return plotNo + ", " + at + ", " + post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> map = new TreeMap<>();
        
        map.put("Amit", new Address("12", "Main St", "NY"));
        map.put("Dibya", new Address("34", "Park Ave", "CA"));
        map.put("Uman", new Address("56", "Oak Rd", "TX"));
        
        Iterator<Map.Entry<String, Address>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Address> entry = itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}