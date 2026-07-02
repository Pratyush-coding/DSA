package Arrays;

import java.util.Scanner;

public class Permutation {
     public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the Array");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int res[]= new int[n];
        int k=0;
        for(i=0;i<arr.length;i++){
            k = arr[i] ;
            res[i] = arr[k];

        }
        System.out.print("Resultant Array is :");
        for(i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

// Leetcode Soln :

// class Solution {
//     public int[] buildArray(int[] nums) {
//         int n = nums.length;
//         int[] res = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             int k = nums[i];
//             res[i] = nums[k];
//         }
        
//         return res;
//     }
// }