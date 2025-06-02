package Assignment_6;
class Q2 {
    BSTNode root;

    BSTNode createTree(int[] sortedArray) {
        root = buildBST(sortedArray, 0, sortedArray.length - 1);
        return root;
    }

    BSTNode buildBST(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        BSTNode node = new BSTNode(arr[mid]);

        node.l= buildBST(arr, start, mid - 1);
        node.r = buildBST(arr, mid + 1, end);

        return node;
    }

    void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.l);
            System.out.print(node.info + " ");
            inorder(node.r);
        }
    }

    public static void main(String[] args) {
        int[] sorted = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Q2 bst = new Q2();
        bst.createTree(sorted);

        System.out.print("In-order Traversal: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
