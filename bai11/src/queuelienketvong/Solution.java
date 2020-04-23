package queuelienketvong;

public  class Solution {
    static class Node{
        int data;
        Node link;
    }
    static class Queue{
        Node front,rear;
        void enQueue(int value){
            Node temp = new Node();
            temp.data = value;
            if (front == null){
                front = temp;
            }else {
                rear.link = temp;
            }
            rear = temp;
            rear.link = front;
        }
        void deQueue(){

            if(front == rear){
                System.out.println("List rỗng");
                rear = front = null;

            }else {
                front = front.link;
                rear.link = front;
            }
        }
        void disPlay(){
            Node temp = front;
            System.out.print("Chuỗi : ");
            while (temp.link != front){
                System.out.printf(" %d ",temp.data);
                temp = temp.link;
            }

        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.front = q.rear = null;
            q.enQueue(10);
            q.enQueue(15);
            q.enQueue(343);
            q.enQueue(103);
            q.disPlay();
        }

    }



}
