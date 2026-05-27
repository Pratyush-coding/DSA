package Arrays;

import java.util.Scanner;

public class Shuffle {
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
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        int index=0;
        int res[]=new int[n];
        for(i=0;i<x;i++){
            res[index++]=arr[i];
            res[index++]=arr[i+x];
        }
        for(i=0;i<index;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}


//Leetcode Format



// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int index = 0;
        
//         int res[] = new int[nums.length]; 
        
        
//         for (int i = 0; i < n; i++) {
//             res[index++] = nums[i];
//             res[index++] = nums[i + n];
//         }
        
        
//         return res;
//     }
// }
