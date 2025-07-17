package LinkedList;

public class nthNodefromlast {
    
    public static void middle(Node head){
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        if(size%2==0){
           //  temp = head;
            for(int i=1;i<size/2;i++){
                temp = temp.next;
            }
        }
        else{
            for(int i=1;i<=size/2;i++){
                temp = temp.next;
            }
        }
        System.out.println(temp.data);
    }
           public static void display(Node head){
               Node temp = head;
               while(temp!=null){
                   System.out.print(temp.data+" ");
                   temp  = temp.next;
               }
           }
    public static Node nthlast(Node head,int x){
        Node temp = head;
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=x;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node deletenthfromlast(Node head,int x){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=x;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;

        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node nthNode(Node head,int n){
              int size=0;
              Node temp = head;
              while(temp!=null){
                  size++;
                  temp = temp.next;
              }
              int m = size-n+1;
              // nth node from start
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        Node q = nthNode(a,2);
//        System.out.println(q.data);
//      Node r =  nthlast(a,3);
//        System.out.println(r.data);
//      a =   deletenthfromlast( a, 6);
//        display(a);
        middle(a);

    }
}
