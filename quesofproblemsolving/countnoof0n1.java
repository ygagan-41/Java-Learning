public class countnoof0n1 {
    static int[] get0and1(int[]arr){
        int size = arr.length;
        int zero_count = 0;
        int ones_count = 0;
        for(int i = 0; i < size; i= i+1){
            if(arr[i]==0){
                zero_count++;
            }
            else{
                ones_count++;
            }
            
        }
        int ans[] = {zero_count , ones_count};
        return ans;
    }
    static void main(){
        int [] arr = {0,1,1,0,1,1,1};
        int [] result = get0and1(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
        
    }
}
