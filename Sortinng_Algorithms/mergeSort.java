//Merge Sort Implementation
//It is not an in-place algorithm & it has a time complexity of O(nlog(n)) also it is a stable algorithm

package Sortinng_Algorithms;
import java.util.*;

public class mergeSort {

    public static void merge(int arr[], int l, int mid, int r){  //function to merge
        int i=l;
        int j=mid+1;
        int k=l;
        int temp[]=new int[r+1];
        while(i<=mid && j<=r){  //compairing values and adding to temporary array
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){  //adding remaining values into temporary array
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int m = l; m <temp.length; m++){  //adding sorted values to original array 
            arr[m]=temp[m];   
        }

    }

    public static void merge_sort(int arr[], int l, int r){  //function to split
        if(l<r){
            int mid=(l+r)/2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
        return;
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

        merge_sort(arr,0,arr.length-1);

        System.out.println("Sorrted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();


        sc.close();
    }
}
