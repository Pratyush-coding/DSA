package Arrays;

import java.util.Scanner;

public class Subarray_bf {
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

        // Subarray
        int curr_sum=0;
        int max_sum = Integer.MIN_VALUE;
        System.out.println("Subarrays Sum : ");
        for(i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                curr_sum=0;
                for(int k=i;k<=j;k++){
                    curr_sum += arr[k];
                }
                System.out.println(curr_sum);
                
                if(max_sum < curr_sum){
                max_sum = curr_sum;
                }

            }
            
            
        }
        System.out.println("Maximum Sum of the Subarrays :"+ max_sum);
    }
}
