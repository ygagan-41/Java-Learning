package leetcode;

public class ekospoj {
    
    static boolean isValidAns(int[] trees , int m , int maxheight){

        int totalwoodcollected = 0;

        for(int i=0; i<trees.length;i++){
            if(trees[i]>maxheight){

                //iska matlab , sawblade overall treeheight se chota hai
                //therefore pakka kuch amount of wood dega katne par

                int currenttreewoodcollected = trees[i] - maxheight;

                totalwoodcollected += currenttreewoodcollected;

            }
        }
        if(totalwoodcollected >= m){
            return true;
        }
        else{
            return false;
        }
    }

    public int maxsawheight(int[] trees , int m){
        int n = trees.length;
        int s = 0;
        int maxi = -1;

        for(int i = 0 ; i<n ; i++){

            if(trees[i] > maxi){
                maxi = trees[i];
            }
        }
        int ans = -1;
        int e = maxi;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(isValidAns(trees, m ,mid)){
                //ans store 
                ans = mid;
                //move to right
                s = mid+1;
            }
            else{
                //move to left
                e = mid-1;
            }
        }
        return ans;
    }
}
