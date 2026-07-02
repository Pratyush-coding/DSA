package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sqsort {
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

        int res[] = new int[n];
        for(i=0;i<arr.length;i++){
            res[i] = arr[i]*arr[i];
        }
        Arrays.sort(res);

        System.out.print("Resultant Array : ");
        for(i=0;i<arr.length;i++){
            System.out.print(res[i]+ " ");
        }

    }

        
}
