package Arrays;

import java.util.Scanner;

public class Freq {
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
        int ctr=0,maxcons=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==1){
                ctr++;
                maxcons = Math.max(maxcons , ctr);
            }
            else{
                ctr=0;
            }
        }
        System.out.println("The No of Max Consecutive 1's are:"+ maxcons);
    }
}




//Leetcode
// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int ctr = 0, maxcons = 0;
        
//         // Instead of 'arr', LeetCode passes the array as 'nums'
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//                 ctr++;
//                 maxcons = Math.max(maxcons, ctr);
//             } else {
//                 ctr = 0;
//             }
//         }
        
//         // Return the final result instead of printing it
//         return maxcons;
//     }
// }