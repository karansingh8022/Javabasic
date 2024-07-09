import java.util.*;

public class Main{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        
        //push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        //pop 
        st.pop();
        
        //peek
        System.out.println(st.peek());
        
        //isEmpty()
        System.out.println(st.isEmpty());
        
        System.out.println(st);
    }
}