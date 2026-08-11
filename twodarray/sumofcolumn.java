package twodarray;

import java.util.ArrayList;
import java.util.List;

public class sumofcolumn {
     public static List<Integer> colsums(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        List<Integer> result = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            int sum = 0;

            for (int row = 0; row < m; row++) {
                int value = arr[row][col];
                sum = sum + value;
            }

            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> ans = colsums(arr);

        System.out.println(ans);
    }
}
