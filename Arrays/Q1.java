package Arrays;
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the Array are:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}