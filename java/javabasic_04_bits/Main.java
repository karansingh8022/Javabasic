import java.util.*;

public class Main{
    public static int getithBit(int n, int i){
        int bitmask = 1<<i;
        return ((n & bitmask) != 0) ? 1 : 0;
    }
    
    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    
    public static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    
    public static int updateithBit(int n, int i, int newBit){
        n = clearithBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
        
    }
    
    public static int clearLastIBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    
    public static int clearRangeOfBits(int n, int i, int j){
        //suppose n = 1000101101010001 , j = 5, i = 12
        //            1111000000001111 , so on doing and we will get our result take a = 1111000000000000 and b = 0000000000001111 and do their or to get the bitmask
        
        int a = (~0)<<(j+1);  // for n = 10 (001010), a = 100000 and b = 000011 so we get 100011 and result is 2 
        int b = (1<<i)-1;
        int bitmask = a | b;
        System.out.println(a + " " + b);
        return n & bitmask;
    }
    
    public static void main(String args[]){
        // System.out.println(~0);
        
        // System.out.println(getithBit(10, 1));
        // System.out.println(setithBit(10, 2));
        // System.out.println(clearithBit(10, 1));
        // System.out.println(updateithBit(10, 2, 1));
        // System.out.println(clearLastIBits(11, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
        
        
    }
}

/*
bit-wise operator:
and = &
or = |
xor = ^
one's component = ~
left shift = <<
right shift = >>

method to convert complement of a number: first find the one's complement of it and then add 1
~0 = -1: 
*/