import java.util.*;

public class revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello";
        String ans = "";
        for(int i=str.length()-1;i>=0;i--){
          ans= ans+str.charAt(i);
        }
        System.out.println(ans);
    }
}
