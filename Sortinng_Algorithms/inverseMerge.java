/*  challenge :
    write merge sort such that it sorts elements in descending order
*/

package Sortinng_Algorithms;

public class inverseMerge {

    public static void inve_merge1(int arr[],int l,int mid,int r){
        int temp[]=new int[r+1];
        int i=l;
        int j=mid+1;
        int k=l;

        while(i<=mid && j<=r){
            if(arr[i]>arr[j]){
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
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int z=l;z<temp.length;z++) {
            arr[z]=temp[z];
        }
    }

    public static void inve_merge(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            inve_merge(arr, l, mid);
            inve_merge(arr, mid+1, r);
            inve_merge1(arr, l, mid, r);
        }
    }

    public static void main(String[] args){
        int arr[]={5,20,6,3,8,10};
        inve_merge(arr,0,arr.length-1);  
        for (int i : arr) {
            System.out.print(i+" ");
        }      
        System.out.println();
    }
}
