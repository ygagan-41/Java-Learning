package linkedlist;

public class doublylinkedlist {
    
    static class Node{
        int data;
        Node previous;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    //head stores the reference of the first node of linkedlist
    private Node head;
    private Node tail;
    private int size;

    doublylinkedlist(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAthead(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.previous = newNode;
            //head update
            head = newNode;
        }
        size++;
    }

    public void insertattail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    
    public void insertatposition(int position , int data){
        if(position < 1 || position > size+1){
            System.out.println("invalid position to insert node");
            return;
        }
        if(position == 1){
            insertAthead(data);
            return;
        }
        if(position == size+1){
            insertattail(data);
            return;
        }
        //in between kahi par insert karna ho to
        Node temp = head;

        for(int i=1;i<=position-2;i++){
            temp = temp.next;
        }
        //ab mera temp previous node pe aa chuka hai
        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        currNode.previous = prevNode;
        prevNode.next = currNode;

        currNode.next = nextNode;
        nextNode.previous = currNode;

        size++;
    }
    //forward Traversal
    public void printlist(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //backward traversal
    public void printbackward(){
        Node temp = tail;

        while(temp!=null){
            System.out.println(temp.data + "<-");
            temp = temp.previous;
        }
        System.out.println();
    }

    //search element in Doubly linked list
    public boolean searchindll(int target){
        if(head == null){
            System.out.println("no nodes inside ll");
            return false;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    //updation in dll
    public boolean update(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
        return false;
    }

    //delete at head
    public void deleteathead(){

        if(head == null){
            System.out.println("no node to delete");
            return;
        }
        //single node -> ll empty hojayegi
        if(head == tail){
            head = null;
            tail = null;
            size=0;
            return;
        }

        //ll has more than one node
        head = head.next;
        head.previous = null;
        size--;

    }

    //delete at tail
    public void deleteattail(){
        if(head == null){
            System.out.println("no node to delete");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        //ll has more than one node

        Node currNode = tail;
        Node prevNode = tail.previous;

        //links change
        prevNode.next = null;
        currNode.next = null;

        //tail update
        tail = prevNode;

        size--;

    }

    //delete at position
    public void deleteatposition(int position){
        if(position <1 || position > size+1){
            System.out.println("invalid position");
            return;
        }
       /*  if(head == null){
            System.out.println("no need to delete");
            return; */

        if(position == 1){
            deleteathead();
            return;
        }
        if(position == size){
            deleteattail();
            return;
        }

        //inbetween wali position to delete
        Node currNode = head;
        for(int i=1;i<=position-1;i++){
            currNode = currNode.next;
        }

        //currnode is at right place (at the node which is to be deleted)
        Node prevNode = currNode.previous;
        Node nextNode = currNode.next;

        //change links
        prevNode.next = nextNode;
        nextNode.previous = prevNode;
        currNode.previous = null;
        currNode.next = null;

        size--;
    }

    public static void main(String[] args) {

        doublylinkedlist mylist = new doublylinkedlist();

        mylist.insertAthead(10);
        mylist.printlist();

         mylist.insertAthead(20);
        mylist.printlist();

        
        mylist.insertAthead(30);
        mylist.printlist();

        
        mylist.insertattail(100);
        mylist.printlist();

        
        mylist.insertatposition(5, 200);
        mylist.printlist(); 

        mylist.printbackward();

       /*  System.out.println("found or not " + mylist.searchindll(55)); */

       
        mylist.deleteathead();
        mylist.printlist();

        mylist.deleteattail();
        mylist.printlist();

        mylist.deleteatposition(3);
        mylist.printlist();
    }

}
