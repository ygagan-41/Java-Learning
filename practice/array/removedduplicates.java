
package array;

import java.util.Arrays;

// Remove duplicates from a sorted array
public class removedduplicates {

    static int[] solve(int[] arr) {

        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        return Arrays.copyOf(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 3, 4};

        int[] result = solve(arr);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
