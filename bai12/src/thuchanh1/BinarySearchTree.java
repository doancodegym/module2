package thuchanh1;

public class BinarySearchTree<T extends Comparable> extends AbstractTree<T> {
    protected TreeNode<T> root;
    protected int size = 0;

    public BinarySearchTree() {
    }
    public BinarySearchTree(T[] object) {
        for(int i = 0;i < object.length;i++){
            insert(object[i]);
        }
    }
    @Override
    public boolean insert(T t) {
       if(root == null){
           root = new TreeNode(t);
       }else {
           TreeNode<T> current = root;
           TreeNode<T> parent = null;
           while (current!= null){
               if (t.compareTo(current.element)<0){
                   parent = current;
                   current = current.left;
               }else if(t.compareTo(current.element)>0) {
                   parent = current;
                   current = current.right;
               }else {
                   return false;
               }
           }
           if(t.compareTo(parent.element)<0){
               parent.left = new TreeNode<>(t);
           }else {
               parent.right = new TreeNode<>(t);
           }
       }
        size++;
        return true;
    }

    @Override
    public void inoder() {
        inorder(root);
    }

    protected void inorder(TreeNode<T> root) {
        if (root == null) {
            return;
        } else {
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }


    @Override
    public int getSize() {
        return size;
    }
    public boolean search(T t) {
        TreeNode current = root;
        while (current != null) {
         if (t.compareTo(current.element) < 0) {
                current = current.left;
            } else if(t.compareTo(current.element) > 0){
                current = current.right;
            }else {
                return true;
            }
        }
        return false;
    }
}
