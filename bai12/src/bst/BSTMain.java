package bst;

import bst.BinarySearchTree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(17);
        bst.insert(20);
        bst.insert(15);
        bst.insert(7);
        bst.insert(1);

//        // Không sắp xếp theo bảng cái tiếng Việt.
//        // Sắp xếp theo thứ tự các kí tự trong bảng mã Unicode.
//        bst.insert("Anh");
//        bst.insert("An");
//        bst.insert("Ân");
//        bst.insert("Ăn");
        System.out.println("Ok");
    }
}
