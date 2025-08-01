package Stack;

import java.util.Stack;

public class removesubsequences {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && st.peek() == arr[i]) {
                // Skip while the sequence continues
                while (i + 1 < n && arr[i] == arr[i + 1]) {
                    i++;
                }
                // Pop the duplicate
                st.pop();
            } else {
                st.push(arr[i]);
            }
        }
        int[] res  = new int[st.size()];
        int m = res.length;
        for(int i=m-1;i>=0;i--){
            res[i] = st.pop();

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
