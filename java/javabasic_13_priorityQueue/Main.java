import java.util.*;

public class Main{
    static class Student implements Comparable<Student>{
        String name;
        int age;
        
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        @Override
        public int compareTo(Student s2){
            return this.age - s2.age;
        }
    }
    
    
    public static void main(String args[]){
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); //max heap
        
        //add  : O(logn)
        // pq.add(1);
        // pq.add(2);
        // pq.add(3);
        // pq.add(4);
        // pq.add(5);
        
        //peek : O(1)
        // System.out.println(pq.peek());
        
        //remove : O(logn)
        // pq.remove();
        
        //isEmpty()
        // System.out.println(pq.isEmpty());
        
        // System.out.println(pq);
        
        pq1.add(new Student("karan", 23));
        pq1.add(new Student("kshitiz", 22));
        pq1.add(new Student("saurabh", 21));
        pq1.add(new Student("harman", 23));
        pq1.add(new Student("sharad", 24));
        
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek().name + " " + pq1.peek().age);
            pq1.remove();
        }
        
        
    }
}