//Shell Sort (variation of bubble sort) Implementation
//It is an in-place algorithm & it has a worst time complexity of O(n^2) and average,bestcase both has O(nlog(n)) time complexity also it is an unstable algorithm

package Sortinng_Algorithms;
import java.util.*;

public class shellSort {

    public static void shell_sort(int arr[]){  //funtion to sort array
        for(int gap= arr.length/2; gap>0;gap/=2){
            for (int j = gap; j < arr.length; j++) {
                int temp=arr[j];
                int i=0;
                for (i = j; i>=gap && arr[i-gap] >temp; i-=gap) {
                    arr[i]=arr[i-gap];
                }
                arr[i]=temp;
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

        shell_sort(arr);

        System.out.println("Sorrted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();


        sc.close();
    }
}
