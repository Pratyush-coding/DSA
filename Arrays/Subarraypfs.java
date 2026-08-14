package Arrays;

import java.util.Scanner;

public class Subarraypfs {
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
        int prefix[]=new int[arr.length];

        prefix[0] = arr[0];
        for(i=1;i<arr.length;i++){ // Creation of Prefix Array
            prefix[i] += arr[i];
        }

        System.out.println("Subarrays Sum : ");
        for(i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                
                curr_sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1]; // Calculation of current Sum using Prefix Array 
                
                if(max_sum < curr_sum){
                max_sum = curr_sum;
                }

            }
            
            
        }
        System.out.println("Maximum Sum of the Subarrays :"+ max_sum);
    }
}
