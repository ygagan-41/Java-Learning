package leetcode;

public class rowwithmaximumones {

    static int getFirstOccurenceIndex(int[][]mat, int rowindex){

        int totalrow = mat.length;
        int totalcolumn = mat[0].length;
        int target = 1;
        int ans = -1;
        
        //handling case where there is no one inside the row

        if(mat[rowindex][totalcolumn] == 0){
            //it means there is no one inside the row
            return totalcolumn;
        }
        else{
            int start = 0;
            int end = totalcolumn -1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(mat[totalrow][mid] == 0 ){
                    //move to right
                    start = mid + 1;
                }
                else{
                    // equals to one wala case
                    ans = mid;
                    end = mid -1;

                }
            }
        }
        return ans;
    }

    public int rowAndMaximumOnes(int[][] mat) {
        int totalrow = mat.length;
        int totalcolumn = mat[0].length;

        //move to each row and for each row find the occurence of first ones
        //using this firstoccurence we will calculate the count of ones

        int max = -1;
        int maxonewalirowindex = -1;

        //update max variable or ans index variable based on matrix

        for(int row = 0; row<totalrow ; row++){

            //for each row we will find firstoccurence

            int firstOccurenceIndex = getFirstOccurenceIndex(mat,row);

            //calculate no of ones in this row

            int onecount = totalcolumn - firstOccurenceIndex;

            //update max or ans index variable basis on count

            if(onecount != 0 && onecount > max){

                //ho sakta hai current row me ans ho

                max = onecount;
                maxonewalirowindex = row;
            }
        }
        return maxonewalirowindex;
    }
}
