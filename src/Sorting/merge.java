package Sorting;
import java.util.*;
public class merge {
    static  void displayarr(int[] arr){
        for(int val:arr){
            System.out.println(val);
        }
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1= mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for( i=0;i<n1;i++) left[i] = arr[l+i];
        for( j=0;j<n2;j++) right[j] = arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while (i<n1&& j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    static  void mergeSort(int[] arr,int l,int r){
        if(l>=r) return;
int mid = (l+r)/2;
mergeSort(arr,l,mid);
mergeSort(arr,mid+1,r);
merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,2};
        int n = arr.length;
        System.out.println(" before sorting");
        displayarr(arr);
        mergeSort(arr,0,n-1);
        System.out.println("array after sorting");
        displayarr(arr);

    }

}
