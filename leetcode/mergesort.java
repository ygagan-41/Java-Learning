package leetcode;

class mergesort {

    static void merge(int [] arr , int start , int end,int mid){
        
        int leftarrlen = mid-start +1;
        int rightarrlen = end - mid;

        int leftarr[] = new int[leftarrlen];
        int rightarr[] = new int[rightarrlen];

        //left arr
        int k = start;
        for(int i= 0; i<leftarrlen ; i++){
            leftarr[i] = arr[k];
            k++;
        }

        //rightarr
        k = mid +1;
        for(int j= 0 ; j<rightarrlen ; j++){
            rightarr[j] = arr[k];
            k++;
        }

        //merge
        int i=0;
        int j=0;
        k=start;
        while(i<leftarrlen && j<rightarrlen){
            if(leftarr[i] < rightarr[j]){
                arr[k] = leftarr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightarr[j];
                j++;
                k++;
            }
        }
        //if any array fully consume so do this
        while(j < rightarrlen){
            arr[k] = rightarr[j];
            j++;
            k++;
        }

        while(i < leftarrlen){
            arr[k] = leftarr[i];
            i++;
            k++;
        }

    }
    static void sort(int[] arr,int l, int r){

        int start = l;
        int end = r;

        //base case
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,end ,mid);

    }
}
