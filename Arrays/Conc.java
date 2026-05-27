package Arrays;

import java.util.Scanner;

public class Conc {
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
        
        for(i=0;i<2;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            
        }
        
    }
}
// Leetcode Soln......
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
        
//         int[] ans = new int[2 * n];
//         int index = 0;
        
        
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < n; j++) {
//                 ans[index] = nums[j];
//                 index++;
//             }
//         }
        
       
//         return ans;
//     }
// }
