package Assignment_6;
class BSTNode {
    int info;
    BSTNode l, r;
    BSTNode(int info) {
        this.info = info;
        l = r = null;
    }
}
public class BST {
    BSTNode root;
    void insert(int value) {
        root = insert(root, value);
    }         
    BSTNode insert(BSTNode root, int v) {
        if (root == null) {
            return new BSTNode(v);
        }
        if (v < root.info)
            root.l = insert(root.l, v);
        else if (v > root.info)
            root.r = insert(root.r, v);
        return root;
    }
    void preorder(BSTNode n) {
		if(n!=null) {
			System.out.print(n.info+" ");
			preorder(n.l);
			preorder(n.r);
		}
	}
	void inorder(BSTNode n) {
		if(n!=null) {
			inorder(n.l);
			System.out.print(n.info+" ");
			inorder(n.r);
		}
	}
	void postorder(BSTNode n) {
		if(n!=null) {
			postorder(n.l);
			postorder(n.r);
			System.out.print(n.info+" ");
		}
	}
    public static void main(String[] args) {
        BST t = new BST();
        int[] values = {10,29,37,4,52,12,51};
        for (int value : values)
            t.insert(value);
        System.out.println("Preorder : ");
        t.preorder(t.root);
        System.out.println("\nInorder : ");
        t.inorder(t.root);
        System.out.println("\nPostorder : ");
        t.postorder(t.root);
    }
}
