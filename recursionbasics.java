class recursionbasics {
    
    static void printmyname(int n){

        //base case
        if(n==0){
            return;
        }

        //preprocessing
        System.out.println("travis");

        //recursive call
        printmyname(n-1);
    }

    public static void main(String[] args) {
        System.out.println(printmyname(10));
    }
}
