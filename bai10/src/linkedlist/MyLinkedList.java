package linkedlist;

public class MyLinkedList<E>{
    private Node head;
    private Node tail;
    private int numNode;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
        tail = head;
        numNode=1;

    }

    private class Node{
        Node next;
        E data;
        private Node(E data){
            this.data = data;
        }
        private E getData(){
            return this.data;
        }

    }
    public Node getHead() {
        return head;
    }

    public E getTail() {
        return tail.data;
    }

    public void add (int index,E data){
        Node temp = head;
        Node holder;
        for (int i = 0;i < index - 1;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;

    }
    public void addFirst(E data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }
    public void get(int index){
        Node temp = head;
        for(int i = 0 ; i < index;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public Object remove(int index){
        if(index<0||index>numNode)return null;
        else if(index == 0) {
            if (numNode == 0) return null;
            else {
                Node temp = head;
                head = head.next;
                numNode--;
                if (head == null) tail = null;
                return temp.data;
            }
        }else if(index== numNode-1){
            if (numNode == 0) return null;
            else if (numNode == 1) {
                Node temp = head;
                head = tail = null;
                numNode = 0;
                return temp.data;
            } else {
                Node current = head;

                for (int i = 0; i < numNode - 2; i++)
                    current = current.next;

                Node temp = tail;
                tail = current;
                tail.next = null;
                numNode--;
                return temp.data;
            }
        }else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNode--;
            return current.data;
        }
    }
    public int getSize() {
        return numNode;
    }
    public boolean contain(E data){
        Node temp = head;
        for(int j =0;j<this.getSize();j++){
            if(temp.data == data) {
                return true;
            }else {
                temp = temp.next;
            }
        }
        return false;

    }public int indexOf(E data){
        Node temp = head;
        for(int j =0;j<this.getSize();j++){
            if(temp.data == data) {
                return j;
            }else {
                temp = temp.next;
            }
        }
        return -1;

    }

    @Override
    public String toString(){
        String result ="";
        Node temp = head;
        while(temp != null) {
            result+=temp.data+" ";
            temp = temp.next;
        }
        return result;
    }


}
