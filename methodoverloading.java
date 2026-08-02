public class methodoverloading {
    static int sumofaandb(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int sumofaandbandc(int a,int b, int c){
        int sum=a+b+c;
        return sum;
    }
    static void main(){
        int a=10;
        int b=20;
        int c=30;
        int result1= sumofaandb(a,b);
        int result2= sumofaandbandc(a,b,c);
        System.out.println(result1);
        System.out.println(result2);
    }
}
