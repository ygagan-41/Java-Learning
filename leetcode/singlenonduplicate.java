package leetcode;

public class singlenonduplicate {

    //find single non-duplicate element using binary search

    public int SingleNonDuplicateElement(int[] nums){

        int size = nums.length;
        int start = 0;
        int end = size - 1;
        
        while( start <= end ){

            int mid = start + ( end - start )/2;

            //agar ek hi element hai toh ye karo
            if(start == end){
                return nums[start];
            }

            //check whether an mid element is single or not 
            int currentValue = nums[mid];

            int prevvalue = -1;
            if ( mid-1 >= 0 ) {
                prevvalue = nums[mid-1];
            }

            int nextValue = -1;
            if( mid+1 > size ){
                nextValue = nums[mid+1];
            }

            if(currentValue != prevvalue && currentValue != nextValue){
                return currentValue ; //yahi answer hai
            }

            if(currentValue == prevvalue && currentValue != nextValue){

                int endingpairofvalue = mid;

                if((endingpairofvalue & 1) == 1){
                    //endingpairofvalue is odd
                    //move to right 
                    //ans is in right
                    start = mid+1;
                }
                else{
                    //endingpairofvalue is even
                    //move to left
                    //ans is in left
                    end = mid-1;
                }
            }

            else if(currentValue != prevvalue && currentValue == nextValue){

                int startingpairofvalue = mid;

                if((startingpairofvalue & 1 ) == 1){
                    //starting index odd hai
                    //move to left
                    end = mid -1;
                }
                else{
                    //starting index even hai
                    //move to right
                    start = mid +1;
                }
            }
        }
        return -1;
    } 
}
