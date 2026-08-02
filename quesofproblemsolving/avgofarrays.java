public class avgofarrays{

    static double printavg( int [] arr){
        int num = arr.length;
        int sum = 0;
        for(int i=0; i<num ;i++){
          sum = sum + arr[i];
    }
     double avg = sum/5;
    return avg;
}
    static void main(){
        int [] arr = {1,2,3,4,5};
        double result = printavg(arr);
        System.out.println(result);
    }
}