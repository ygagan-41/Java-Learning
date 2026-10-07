package linkedlist;

public class circulardoublylinkedlist {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public circulardoublylinkedlist(){
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
            head.prev = tail;
            tail.next = head;
        }

        //if not
        else{
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;

        }
        size++;
    }

    public void insertattail(int data){
        Node newNode = new Node(data);

        //if ll is empty
        if(head == null){
            head = newNode;
            tail = newNode;

            //circular connection
            head.prev = tail;
            tail.next = head;
        }

        //if not
        else{
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }
        size++;
    }

    public void insertatposition(int position , int data){

        //valid positions
        //1 to size + 1
        if(position < 1 || position > size + 1){
            System.out.println("invalid position");
            return;
        }

        //insert at head
        if(position == 1){
            insertathead(data);
            return;
        }

        //insert at tail
        if(position == size+1){
            insertattail(data);
            return;
        }

        Node prevNode = head;

        for(int i=1; i<= position-2;i++){
            prevNode = prevNode.next;
        }

        Node currNode = new Node(data);
        Node nextNode = prevNode.next;

        prevNode.next = currNode;
        currNode.next = prevNode;
        nextNode.prev = currNode;
        currNode.next = nextNode;

        size++;
    }

    public void printForward(){

        if(head == null){
            System.out.println("cdll is empty");
            return;
        }

        Node current = head;

        do{
            System.out.println(current.data);
            current = current.next;
            if(current != head){
                System.out.println("<->");
            }
        }while(current != head);

        System.out.println("<-> (Back to head");
    }

    public void printBackward(){
        
        if(tail == null){
            System.out.println("cdll is empty");
            return;
        }

        Node current = tail;

        do{
            System.out.println(current.data);
            current = current.prev;
            if(current != tail){
                System.out.println("<->");
            }
        }while(current != tail);

        System.out.println("<-> (Back to head");
    }

    public boolean searchelement(int target){
        if(head == null){
            return false;
        }

        Node current = head;

        do{
            if(current.data == target){
                return true;
            }
            current = current.next;
        }while(current != head);
        return false;
    }

    public void deleteathead(){
        //if ll is empty
        if(head == null){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        //Move head forward
        head = head.next;

        //maintain circular connection
        head.prev = tail;
        tail.next = head;

        //disconnect deleted node
        temp.next = null;
        temp.prev = null;

        size--;
    }

    public void deletetail(){
        //if ll is empty
        if(tail == null){
            System.out.println("cdll is empty");
            return;
        }
        //only one node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node prevNode = tail.prev;
        
        //disconnect tail node
        tail.next = null;
        tail.prev = null;

        //update tail
        tail = prevNode;

        //connections sahi karo new tail ke
        tail.next = head;
        head.prev = tail;

        size--;
    }

    //delete node at a given positions
    public void deleteatpositions(int position){
        //valid positions
        //1 to size + 1
        if(position < 1 || position > size){
            System.out.println("invalid position");
            return;
        }

        //insert at head
        if(position == 1){
            deleteathead();
            return;
        }

        //delete at tail
        if(position == size+1){
            deletetail();
            return;
        }

        Node prevNode = head;

        for(int i=1;i<=position-2;i++){
            prevNode = prevNode.next;
        }

        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        currNode.prev = null;
        currNode.next = null;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size--;
    }
}
