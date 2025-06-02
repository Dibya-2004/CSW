package Assignment_6;
class Country{
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode{
    Country country;
    BNode left, right;

    BNode(Country country) {
        this.country = country;
        left = right = null;
    }
}

class BSTCountry{
    BNode root;

    void insert(Country c){
        root = insertRec(root, c);
    }

    BNode insertRec(BNode root, Country c){
        if (root == null)
            return new BNode(c);
        if (c.population < root.country.population)
            root.left = insertRec(root.left, c);
        else
            root.right = insertRec(root.right, c);
        return root;
    }
    void inOrder(){
        inOrderRec(root);
    }
    void inOrderRec(BNode root){
        if (root != null){
            inOrderRec(root.left);
            System.out.println(root.country.name + ": " + root.country.population);
            inOrderRec(root.right);
        }
    }
    
    Country findMin(){
        BNode current = root;
        while (current.left != null)
            current = current.left;
        return current.country;
    }
    Country findMax(){
        BNode current = root;
        while (current.right != null)
            current = current.right;
        return current.country;
    }
}

public class Q4{
    public static void main(String[] args){
        BSTCountry bst = new BSTCountry();
        bst.insert(new Country("India", 1400));
        bst.insert(new Country("USA", 330));
        bst.insert(new Country("China", 1440));
        bst.insert(new Country("Brazil", 213));
        bst.insert(new Country("UK", 68));

        bst.inOrder();

        Country min = bst.findMin();
        System.out.println("Minimum population: " + min.name + " - " + min.population);

        Country max = bst.findMax();
        System.out.println("Maximum population: " + max.name + " - " + max.population);
    }
}
