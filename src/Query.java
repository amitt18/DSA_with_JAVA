import java.util.Scanner;
public class Query{
    static  int[] makefrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makefrequencyArray(arr);
        System.out.println("enter no. of query");
        int q = sc.nextInt();
        while (q>0){
            System.out.println("search no");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
            q--;
        }
        }




}
