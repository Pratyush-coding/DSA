package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Insert {
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
        System.out.print("Enter the value of key:");
        int key = sc.nextInt();
        Arrays.sort(arr);
        Binary(arr , key);
    }
    public static void Binary(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        int mid=0, flag=0 ;
        while(start <= end){
            mid = (start + end)/2;
            if (arr[mid] == key){
                System.out.println("Found at Index: "+ mid);
                flag = 1;
                break ;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid -1 ;
            }
        }
        if (flag != 1){
            System.out.println("Can be Inserted at position: "+ start);
        }
        

    }

    
}



// Leetcode  :

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {
//             int mid = ( start + end ) / 2; 

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return start; 
//     }
// }
