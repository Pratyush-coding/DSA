package Arrays;

import java.util.Scanner;

public class Pairs {
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

        // Nested Loops Concept for Pairs
        System.out.println("Output:");
        for(i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    
}
