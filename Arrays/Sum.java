package Arrays;

import java.util.*;

public class Sum{
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
        for(i=0;i<arr.length;i++){
            s +=arr[i];
        }
        System.out.println("The Sum of the Array: "+s);
    }
}