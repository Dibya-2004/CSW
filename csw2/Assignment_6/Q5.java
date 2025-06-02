package Assignment_6;
class NodeDel {
    int data;
    NodeDel left, right;

    NodeDel(int value) {
        data = value;
        left = right = null;
    }
}

class Q5 {
    NodeDel root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    NodeDel insertRec(NodeDel root, int key) {
        if (root == null)
            return new NodeDel(key);
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else
            root.right = insertRec(root.right, key);
        return root;
    }

    NodeDel delete(NodeDel root, int key) {
        if (root == null)
            return root;
        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int minValue(NodeDel root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    void inorder(NodeDel root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Q5 tree = new Q5();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder(tree.root);
        System.out.println();

        tree.root = tree.delete(tree.root, 20);
        tree.inorder(tree.root);
        System.out.println();

        tree.root = tree.delete(tree.root, 30);
        tree.inorder(tree.root);
        System.out.println();

        tree.root = tree.delete(tree.root, 50);
        tree.inorder(tree.root);
        System.out.println();
    }
}
