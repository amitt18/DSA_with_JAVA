package Sorting;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j=i;
            while ( j>0 && a[j]<a[j-1]){
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;
            }
        }
        for(int amit:a){
            System.out.print(amit+" ");
        }
    }
}
