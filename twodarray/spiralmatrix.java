package twodarray;

import java.util.List;
import java.util.ArrayList;
class spiralmatrix {
    
    public static List<Integer> spiralorder(int[][] matrix){

        int rows = matrix.length;
        int colns = matrix[0].length;

        List<Integer>result = new ArrayList<>();

        int startingcolns = 0;
        int startingrows = 0;
        int endingrows = rows-1;
        int endingcolns = colns -1;

        while( startingrows <= endingrows && startingcolns <= endingcolns){

            //row wise left to right

            for(int col = startingcolns ; col<=endingcolns ; col++){
                result.add(matrix[startingrows][col]);
            }
            startingrows++;

            //top to bottom 

            for(int row =startingrows ; row<=endingrows ; row++){
                result.add(matrix[rows][endingcolns]);
            }
            endingcolns--;

            if(startingrows <= endingcolns){

                //right to left

                for(int col = endingcolns ; col>=startingcolns ; colns--){
                    result.add(matrix[endingrows][colns]);
                }
                endingrows--;
            }
            
            if(endingcolns>=startingcolns){
                for(int row=endingrows ; row>=startingrows ; row--){
                    result.add(matrix[row][startingcolns]);
                }
                startingcolns++;
            }
        }
           return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        List<Integer> ans = spiralorder(matrix);

        System.out.println(ans);
    }
}
