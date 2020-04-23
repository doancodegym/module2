package findelement;

public class FindElement<T extends Comparable> {
    Node<T> root;
    Node currentNode = root;
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
    public void findElement(T t){
        Node currentNode = root;
        boolean check = false;
        while (currentNode != null){

            int result = t.compareTo(currentNode.element);
            if(result > 0){
                if(currentNode.right != null){
                    if(result == 0){
                        check = true;
                        break;
                    }
                    currentNode = currentNode.right;
                }else {
                    System.out.println("Cây trống,Element không được tìm thấy trong cây");
                }
                break;
            }else if(result < 0){
                if(currentNode.left != null){
                    if(result == 0){
                        check = true;
                        break;
                    }
                    currentNode = currentNode.left;
                }else {
                    System.out.println("Cây trống,Element không được tìm thấy trong cây");
                }
                break;
            }
        }
        if(check){
            System.out.println(t + " có ở trong cây !");
        }else {
            System.out.println("Không tìm thấy !");
        }

    }

}
