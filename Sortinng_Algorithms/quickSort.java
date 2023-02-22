//Quick Sort Implementation
//It is an in-place algorithm & it has a best and average time complexity of O(nlog(n)) and worst time complexity of     O(n^2) also it is an unstable algorithm with O(log(n)) space complexity

package Sortinng_Algorithms;
import java.util.*;

public class quickSort {

    public static int partition(int arr[], int s, int e){  //fucntion to placing value into correct position
        int pivot=arr[e];
        int pindex=s;
        for(int i=s;i<e;i++){
            if(arr[i]<pivot){
                int temp=arr[i];  //swap element at i with pindex postion
                arr[i]=arr[pindex];
                arr[pindex]=temp;
                pindex++;
            }
        }
        int temp=arr[e];  //swap element at e with pindex postion
        arr[e]=arr[pindex];
        arr[pindex]=temp;
        
        return pindex;
    }
    
    public static void quick_sort(int arr[], int s, int e){  //parition
        if(s<e){
            int p=partition(arr, s, e);
            quick_sort(arr, s, p-1);
            quick_sort(arr, p+1, e);
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

        quick_sort(arr,0,arr.length-1);

        System.out.println("Sorrted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();


        sc.close();
    }
}
