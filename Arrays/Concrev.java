package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Concrev {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Append the elements in reverse order directly to the same list
        for (int i = n - 1; i >= 0; i--) {
            arr.add(arr.get(i));
        }

        System.out.println("Output: " + arr);
        
    }
}


// Leetcode:

// class Solution {
//     public int[] concatWithReverse(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[2 * n];
        
//         for (int i = 0; i < n; i++) {
//             result[i] = nums[i];           
//             result[2 * n - 1 - i] = nums[i]; 
//         }
        
//         return result;
//     }
// }