package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class display {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());

        }
        while(helper.size()>0){
            q.add(helper.remove());
        }
        System.out.println(helper);
        System.out.println(q);
    }
}
