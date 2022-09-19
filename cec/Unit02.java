
/*UNIT2 Creating linked list of long type and perform following
operations to it.
Add:1,2,3,4
Return head of queue
Return and remove head of queue.
POP: 3 times */
import java.util.*;

public class Unit02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedList<Long> l1=new LinkedList<Long>();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1.peek());
        // System.out.println(l1.remove());
        System.out.println(l1.pop());
        System.out.println(l1.pop());
        System.out.println(l1.pop());

    }
}