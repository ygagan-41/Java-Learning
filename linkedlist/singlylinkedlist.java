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
    public void printlist(){
        node temp = head;
        while(temp!= null){
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println();
    }

    //utility functions

    //for empty
    public boolean isempty(){
        return head == null;
    }

    //for size
    public int getsize(){
        return size;
    }

    //to get head
    public int gethead(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    //to get tail
    public int gettail(){
        if(tail == null){
            return -1;
        }
        else{
            return tail.data;
        }
    }

    //searching
    //return true if value exists
    public boolean search(int target){
        node temp = head;

        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp=temp.next;
            }
        }
        return false;
    }

    //find positions
    public int findpositions(int target){
        node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == target){
                return position;
            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    //update using positions

    public void updateposition(int position , int newdata){
        node temp = head;

        for(int i=1; i<=position ; i++){
            temp = temp.next;
        }
        temp.data = newdata;
    }

    //update first occurence of value
    public boolean updatevalue(int oldval , int newval){
        node temp =head;
        while(temp !=null){
            if(temp.data == oldval){
                temp.data = newval;
            }
            temp = temp.next;
        }
        return false;
    }

    //deletion
    //delete at head
    public void deletehead(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;

        if(head == null){
            tail =null;
        }
    }

    //delete at node
    public void deletetail(){
        if(head == null){
            return ;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        node temp =head;
        for(int i=0 ; i<size-2 ; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    //delete at position

    public void deleteatposition(int position){
        if(position<1 || position>size+1){
            System.out.println("list is empty");
            return;
        }
        if(position == 1){
            deletehead();
            return;
        }
        if(position == size){
            deletetail();
            return;
        }

        node prev = head;
        for(int i = 1; i<=position-2; i++){
            prev = prev.next;
        }
        node curr = prev.next;
        node forward = curr.next;

        prev.next = forward;
        curr.next = null;

        size--;
    }

    //delete first occurence of value

    public boolean deletevalue(int target){
        if(head == null){
            return false;
        }
        if(head.data == target){
            deletehead();
            return true;
        }
        node prev = head;
        node curr = head.next;

        while(curr != null){
            if(curr.data == target){
                node forward = curr.next;
                prev.next = forward;
                curr.next = null;
                if(tail == curr){
                    tail = prev;
                }
                  size--;
                  return true;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        singlylinkedlist mylist = new singlylinkedlist();

        if(mylist.isempty()){
            System.out.println("list is empty");
        }
        System.out.println("size:" + mylist.getsize());

        //insert at head
        mylist.insertAthead(10);
     

        //insert at tail
        mylist.insertattail(50);
      

        //insert at position
        mylist.insertatposition(2, 30);

        mylist.deletehead();
        

        System.out.println(mylist.gethead());
        System.out.println(mylist.gettail());
        System.out.println(mylist.search(200));
        System.out.println(mylist.findpositions(10));

        mylist.updateposition(1, 200);
    }
}
