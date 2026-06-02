package Arrays;

import java.util.Scanner;

public class Rsum {
    public static void main(String args[]){
        System.out.println("Enter the size of the Array");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int arr1[]=new int[n];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr1[i]=sum;
            
        }
        System.out.println("The elements of the Array are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}


// leetcode
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n = nums.length;
//         int sum = 0;
//         int arr1[] = new int[n];
        
//         for (int i = 0; i < nums.length; i++) {
//             sum = sum + nums[i];
//             arr1[i] = sum;
//         }
        
        
//         return arr1;
//     }
// }