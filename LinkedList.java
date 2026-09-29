class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList{
    static Node head;
    static void insertEnd(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    static void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node newnode = new Node(10);
        Node newnode1 = newnode.next;
        insertEnd(20);
        display();
    }
}