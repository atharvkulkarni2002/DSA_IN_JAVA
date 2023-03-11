/*  challenge :
    write insertion sort in recursive way
*/

package Sortinng_Algorithms;

public class recursiveInsertion {

    public static void recur_inser(int arr[],int n){
        if(n<2){
            return;
        }
        recur_inser(arr, n-1);
        int key=arr[n-1];
            int j=n-2;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
    }
    
    public static void main(String[] args) {
        int arr[]={5,20,6,3,8,10};
        recur_inser(arr,arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
