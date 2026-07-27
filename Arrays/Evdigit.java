package Arrays;

import java.util.Scanner;

public class Evdigit {
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
        int d=0,ev=0;
        for(i=0;i<arr.length;i++){
            int temp = arr[i];
            d=0;
            while(temp!=0){
                d++;
                temp=temp/10;
            }
            if(d%2==0){
                ev++;
            }
        }
        System.out.println("Number of elements with even number of digits: "+ ev);
    }
    
}

// leetcode

// class Solution {
//     public int findNumbers(int[] nums) {
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int temp = nums[i];
//             int digits = 0; 

//             while (temp != 0) {
//                 digits++;
//                 temp = temp / 10;
//             }

//             if (digits % 2 == 0) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }