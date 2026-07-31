package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class B_search {
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
        System.out.print("Enter the valuie of key:");
        int key = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Found at index :"+ Binary(arr , key));
    }
    public static int Binary(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while(start <= end){
            mid = (start + end)/2;
            if (arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid -1 ;
            }
        }
        return -1;

    }
}

// Leetcode

// class Solution {
//     public int search(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;
        
//         while (start <= end) {
            
//             int mid = (start + end)/2;
            
//             if (nums[mid] == target) {
//                 return mid;
//             } 
//             else if (nums[mid] < target) {
//                 start = mid + 1;
//             } 
//             else {
//                 end = mid - 1;
//             }
//         }
        
//         return -1;
//     }
// }