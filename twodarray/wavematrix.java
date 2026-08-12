package twodarray;

import java.util.List;
import java.util.ArrayList;

class wavematrix {
    public static List<Integer> waveprintmatrix(int[][]matrix,int m,int n){
        List<Integer> result = new ArrayList<>();

        //lets move column wise 
        for( int col = 0 ; col < n ; col ++){

            //now we will check even odd of a column and work according to that

            if((col & 1) == 1){

                //so odd then move bottom to top

                for(int row = m-1 ; row>=0 ; row--){
                    result.add(matrix[row][col]);
                }
            }
            else{
                //even
                //top to bottom

                for(int row = 0; row<m ; row ++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = waveprintmatrix(matrix, m ,n);

        System.out.println(ans);
    }
}
