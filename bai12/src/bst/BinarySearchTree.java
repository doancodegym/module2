package bst;

import bst.Node;

public class BinarySearchTree<T extends Comparable> {
        public Node root;
        public void insert(T t){
            if(root == null){
                root = new Node<>(t);
            }else{
                Node<T> currentNode = root;

                while (currentNode != null) {

                    int compareResult = t.compareTo(currentNode.element);

                    if (compareResult > 0) {
                        // move to right
                        if (currentNode.right == null) {
                            currentNode.right = new Node<>(t);
                            break;
                        } else {
                            currentNode = currentNode.right;
                        }
                    } else if (compareResult < 0) {
                        // move to left
                        if (currentNode.left == null) {
                            currentNode.left = new Node<>(t);
                            break;
                        } else {
                            currentNode = currentNode.left;
                        }
                    } else {
                        throw new RuntimeException("Giá trị này đã tồn tại trong BST.");
                    }
                }
            }
        }
}
