package findelement;

import bst.BinarySearchTree;

public class FindMain {
    public static void main(String[] args) {
        FindElement<Integer> bst = new FindElement<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(17);
        bst.insert(20);
        bst.insert(15);
        bst.insert(7);
        bst.insert(1);

        bst.findElement(15);
    }
}
