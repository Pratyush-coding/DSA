package Arrays;

import java.util.Scanner;

public class Rcstmr {
    public static void main(String args[]){
        System.out.println("Enter the size of the Array");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][] = new int[n][2];
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int arr1[]=new int[n];
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
                arr1[i]=sum;
                
            }
        }
        int max=arr1[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
            
        }
        System.out.println("The Richest Customer:"+ max);

    }
    
}

// Leetcode
// class Solution {
//     public int maximumWealth(int[][] accounts) {
        
//         int n = accounts.length;
        
//         int sum = 0;
//         int arr1[] = new int[n];
        
        
//         for (int i = 0; i < accounts.length; i++) {
//             sum = 0;
//             for (int j = 0; j < accounts[i].length; j++) {
//                 sum += accounts[i][j];
//                 arr1[i] = sum;
//             }
//         }
        
        
//         int max = arr1[0];
//         for (int i = 1; i < accounts.length; i++) {
//             if (max < arr1[i]) {
//                 max = arr1[i];
//             }
//         }
        
       
//         return max;
//     }
// }
