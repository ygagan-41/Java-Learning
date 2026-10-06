package linkedlist;

public class circularsinglylinkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public circularsinglylinkedlist(){
        head = null;
        tail = null;
        size = 0;
    }

    public void insertathead(int data){
        Node newNode = new Node(data);

        //if ll is empty
        if(head == null){
            head = newNode;
            tail = newNode;

            //circular connection
            tail.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;

            //maintain circular connection
            tail.next = head;
        }
        size++;
    }

    public void insertattail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;

            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;

            tail.next = head;
        }
        size++;
    }

    public void insertatposition(int position,int data){
        //invalid positions
        if(position < 1 || position > size+1){
            System.out.println("invalid position");
            return;
        }

        //insertathead
        if(position == 1){
            insertathead(data);
            return;
        }

        //insertattail
        if(position == size+1){
            insertattail(data);
            return;
        }

        Node newNode = new Node(data);

        //reach node before insertion position
        Node previous = head;

        for(int i=1; i<position-1; i++){
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;

        size++;
    }

    //traversal 
    public void printlist(){

        if(head == null){
            System.out.println("cll is empty");
            return;
        }
        Node current = head;

        do{
            System.out.println(current.data + " -> ");
            current = current.next;
        }while(current != head);
        System.out.println("(Back to Head");
    }

    public boolean search(int target){

        //empty
        if(head == null){
            return false;
        }

        Node current = head;

        do{
            if(current.data == target){
                return true;
            }
            current = current.next;
        }while( current != head );
            return false;
    }

    public void deleteathead(){
        //case-1: empty ll
        if(head == null){
            System.out.println("cll is empty");
            return;
        }

        //case-2: only one node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        head = head.next;

        //maintain circular connection
        tail.next = head;

        //disconnect deletenode
        temp.next = null;

        size--;
    }

    public void deleteattail(){
        //case-1: empty ll
        if(head == null){
            System.out.println("cll is empty");
            return;
        }

        //case-2: only one node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node prevNode = head;
        for(int i=0;i<=size-2;i++){
            prevNode = prevNode.next;
        }

        prevNode.next = head;
        tail.next = null;
        tail = prevNode;
       
        size--;
    }

    public void deleteatposition(int position){
        if (position<1 || position > size) {
            System.out.println("invalid position");
            return;
        }

        if(position == 1){
            deleteathead();
            return;
        }
        if(position == size){
            deleteattail();
            return;
        }

        Node prevNode = head;

        for(int i=1; i<=position-2;i++){
            prevNode = prevNode.next;
        }

        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        prevNode.next = nextNode;

        //disconnected deleted node
        currNode.next = null;

        size--;
    }

}
