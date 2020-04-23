package findelement;

public class Node<T extends Comparable> {
    public Node<T> left;
    public Node<T> right;
    public T element;
    Node(T t){
        this.element = t;
    }
}
