package Arrays;

import java.util.Scanner;

public class Goodpair {
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
        int ctr=0;
        System.out.println("Good Pair:");
        for(i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print("("+ i +"," + j +")");
                    ctr++;
                }
            }
        }
        System.out.println();
        System.out.println("Total Number of Good Pairs are:"+ ctr);
    }
    
}

// Leetcode:

// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int ctr = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     ctr++;
//                 }
//             }
//         }
        
//         return ctr;
//     }
// }