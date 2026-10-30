package stack;

public class basicsII {

    static class Mystack{

        //private data members
        private int[] arr;
        private int capacity;
        private int top;

        //constructor
        public Mystack(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];

            this.top = -1;
        }

        //member functions
        public void push(int value){
            if(top == capacity -1){
                System.out.println("cannot insert elements , stack overflow");
            }
            else{
                top++;
                arr[top] = value;
            }
        }

        public void pop(){
            if(top == -1){
                System.out.println("cannot pop element, stack underflow");
            }
            else{
                arr[top] = -1;
                top--;
            }
        }

        public int peek(){
            if(top == -1){
                System.out.println("stack is empty");
                return -1;
            }
            else{
                return arr[top];
            }
        }

        public int getsize(){
            return top+1;
        }

        public int getcapacity(){
            return this.capacity;
        }

        public boolean checkempty(){
            if(top == -1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static  void printstack(Mystack st){
        while(!st.checkempty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    public static void main(String[] args) {

        Mystack st = new Mystack(3);

        st.push(10);
        
        st.push(20);
        
        st.push(30);
        
        printstack(st);

        /* st.push(40);

        st.pop();
        System.out.println("stack size is " + st.getsize());

        st.pop();
        System.out.println("stack size is " + st.getsize());

        st.pop();
        System.out.println("stack size is " + st.getsize());

        st.pop();
        System.out.println("stack size is " + st.getsize());

        System.out.println(st.checkempty()); */
    }
}
