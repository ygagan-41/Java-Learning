package twodarray;

class transposematrix {

    public static int[][] transpose(int[][] matrix){

        //agar matrix null huyi toh ye print hoga 
        if(matrix == null || matrix.length == 0){
            return new int [0][0];
        }

        //for original array
        int total_rows = matrix.length;
        int total_columns = matrix[0].length;

        //for new array
        int new_total_rows = total_columns;
        int new_total_columns = total_rows;
        int ans[][] = new int[new_total_rows][new_total_columns];

        //actual logic

        for(int i = 0 ; i<total_rows ; i++){
            for(int j = 0 ; j<total_columns ; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("original matrix is : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = transpose(matrix);

        System.out.println("Transpose matrix is : ");
        for(int i = 0 ; i<result.length ; i++){
            for(int j = 0 ; j<result[0].length ; j++){
              System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
}
}