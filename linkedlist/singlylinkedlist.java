package linkedlist;

//singlylinkedlist naam ki ek class banayi hai jiske andar hamari ll hai
public class singlylinkedlist {
    
    //so ll is madeup of nodes where each node will contains two things
    static  class node{

        //data -> actual value
        int data;

        //next -> address of next node
        node next;


        //constructor
        //node constructor hai, here data is the value i want to put inside the node
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //head stores the reference of the first node of linkedlist
    private node head;
    private node tail;
    private int size;

    // linked list constructor
    public singlylinkedlist(){

        //initially head, tail null hai and size zero hai
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    //insertion at head or beginning

    public void insertAthead(int data){

        node newNode = new node(data);

        //if linked list is empty -> head
        //tail ko new node par point kardo

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase size by one
        size++;
    }

    //insert at tail
    public void insertattail(int data){
        node newNode = new node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //insert at position
    public void insertatposition(int position , int data){
        if(position < 1 || position > size + 1){
            System.out.println("Insertion not possible");
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

        //agar position kahi middle me karni hai toh

        node prevnode = head;
        for(int i=1;i<=position-2;i++){
            prevnode = prevnode.next;
        }

        node newNode = new node(data);

        //update links
        prevnode.next = prevnode.next;
        prevnode.next = newNode;

        size++;
    }

    //Traversal
    
}
