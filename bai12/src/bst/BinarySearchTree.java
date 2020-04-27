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
    public void remove(T element){
        remove(root, element);
    }
    public Node<T> findMax(Node<T> root){
        while (root.right != null){
            root = root.right;
        }
        return root;
    }
    private Node<T> remove(Node<T> root, T element){
        if (root==null){
            return root;
        } else {

            if (element.compareTo(root.element)>0){
                root.right= remove(root.right,element);
            } else if (element.compareTo(root.element)<0){
                root.left=remove(root.left,element);
            } else {
                if (root.left==null){
                    return root.right;
                } else if (root.right==null){
                    return root.left;
                } else {
                    root.element =findMax(root.left).element;
                    root.left=remove(root.left,root.element);
                }
            }
        }
        return root;
    }

}
