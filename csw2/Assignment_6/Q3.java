package Assignment_6;
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BSTCheck {
    boolean isBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBST(Node node, int min, int max) {
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        return isBST(node.left, min, node.data - 1) &&
               isBST(node.right, node.data + 1, max);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        BSTCheck checker = new BSTCheck();
        if (checker.isBST(root))
            System.out.println("The tree is a Binary Search Tree.");
        else
            System.out.println("The tree is NOT a Binary Search Tree.");
    }
}

