//Insertion Sort Implementation
//It is an in-place algorithm & it has a time complexity of O(n^2) also it is a stable algorithm

package Sortinng_Algorithms;
import java.util.*; //importing java.util pacakage

public class insertionSort {
    
    public static void insertion_sort(int arr[]){  //funtion to sort array
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;  //inserting at it's correct position
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);  //Creating instance of a Scanner class

        System.out.println("Enter the length of array");
        int n=sc.nextInt();  //getting the size of array as input

        int arr[]=new int[n];  //Declaring an array

        System.out.println("Enter the integer values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  //taking elements of array as input
        }

        insertion_sort(arr);

        System.out.println("Sorrted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        sc.close();
    }
}
