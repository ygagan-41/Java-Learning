package stack;

//stack implement using linked list

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }

}

class stack{
    node top = null;


    void push(int data){
        node newnode = new node(data);

        newnode.next = top;
        top = newnode;
    }

    int pop(){
        if(top == null){
            System.out.println("STack is empty");
            return -1;
        }
        int removed = top.data;
        top = top.next;

        return removed;
    }

    int peek(){
         if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean isempty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }

    void display(){

        node temp = top;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}

public class basicIII {
    
    public static void main(String[] args) {
        stack st = new stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.pop();
        st.pop();

        st.peek();

        System.out.println(st.isempty());
        
        st.display();


    }
}
