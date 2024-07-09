import java.util.*;

public class Main{
    public static void main(String args[]){
        //queue is an interface in java so we cannot directly create its object, we can use LinkedList and ArrayList
        Queue<Integer> q = new LinkedList<>();
        
        // //add 
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        
        // //peek()
        // System.out.println(q.peek());
        
        // //remove()
        // q.remove();
        
        // //isEmpty()
        // System.out.println(q.isEmpty());
        
        // System.out.println(q);
        
        
        Deque<Integer> dq = new LinkedList<>();
        
        //addFirst
        dq.addFirst(1);
        dq.addFirst(2);
        
        //addLast
        dq.addLast(3);
        dq.addLast(4);
        
        // //removeFirst
        // dq.removeFirst();
        
        // //removeLast
        // dq.removeLast();
        
        //getFirst()
        System.out.println(dq.getFirst());
        
        //getLast()
        System.out.println(dq.getLast());
        
        System.out.println(dq);
        
    }
}