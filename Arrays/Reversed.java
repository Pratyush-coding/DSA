package Arrays;

import java.util.*;

public class Reversed{
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
        int s=0;
        System.out.print("The Reversed elements are: ");
        for(i=arr.length-1;i>=0;i--){
            System.err.print(arr[i]+" ");
        }
    }
}