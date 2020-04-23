package bst;

public class Node<T extends Comparable>  {
    public Node<T> left;
    public Node<T> right;
    public T element;
   public Node(T t){
       this.element = t;
    }
}
