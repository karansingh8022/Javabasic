import java.util.*;

public class Main{
    public static void main(String args[]){
        // Node head = new Node(1);
        // Node tail = head;
        
        // head = head.addStart(head, 4);
        // head = head.addStart(head, 6);
        // head = head.addStart(head, 9);
        // tail = head.addLast(tail, 5);
        // head = head.removeFirst(head);
        // head.print(head);
        
        // System.out.print(head.size);
        
        LinkedList<Integer> ll = new LinkedList<>(); //takes only object : Interger, Float, Character
        
        //add
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        
        //remove
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println(ll);
        
    }
}

class Node {
    int data;
    private Node next;
    static int size = 0;
    
    Node(int data){
        this.data = data;
        this.next = null;
        size++;
    }
    
    void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    Node addStart(Node head, int data){
        Node curr = head;
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }
    
    Node addLast(Node tail, int data){
        Node temp = new Node(data);
        tail.next = temp;
        tail = temp;
        return tail;
    }
    
    Node removeFirst(Node head){
        head = head.next;
        size--;
        return head;
    }
}



