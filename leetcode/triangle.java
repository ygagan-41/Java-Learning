package leetcode;

import java.util.List;

public class triangle {
      static int solve(List<List<Integer>> triangle, int rowindex , int colindex){
        //base case
        if(rowindex == triangle.size()-1){
            //jis value par khade ho use include karo or vapas jaao
            return triangle.get(rowindex).get(colindex);
        }

        //1 case hum solve karege baaki recursion karega
        int downans = solve(triangle , rowindex + 1 , colindex);
        int diagonalans = solve(triangle ,rowindex +1 , colindex +1);
        int finalans = triangle.get(rowindex).get(colindex) + Math.min(downans , diagonalans);
        return finalans;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowindex = 0;
        int colindex = 0;
        int ans = solve(triangle , rowindex , colindex);
        return ans;
    }
}
