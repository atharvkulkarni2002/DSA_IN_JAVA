//Selection Sort Implementation
//It is an in-place algorithm & it has a time complexity of O(n^2) also it is an unstable algorithm

package Sortinng_Algorithms;
import java.util.*;;  //importing java.util pacakage

public class selectionSort {

    public static void selection_sort(int arr[]){  //fuction to sort array
        
        for (int i = 0; i < arr.length-1; i++) {

            int min=i;

            for (int j = i+1; j < arr.length; j++) {  //finding the location of minimum value in an array
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){  //swapping
                int tmep=arr[i];
                arr[i]=arr[min];
                arr[min]=tmep;
            }
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

        selection_sort(arr);

        System.out.println("Sorrted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();


        sc.close();
    }
}
