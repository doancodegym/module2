package thuchanh1;

public class BSTMain {
    public static void main(String[] args) {
        //create a BST
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(5);
        tree.insert(9);
        tree.insert(1);
        tree.insert(20);
        tree.insert(6);
        tree.insert(13);
        tree.insert(17);
        System.out.println("Inorder (sorted): ");
        tree.inorder(tree.root);
        System.out.println("\nThe number of nodes is: " + tree.getSize());
        tree.search(17);
    }
}
