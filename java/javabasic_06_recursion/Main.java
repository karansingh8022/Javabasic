import java.util.*;

public class Main{
    //print the decreasing number
    public static void printDecreasing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
        return;
    }
    
    //print the increasing order
    public static void printIncreasing(int n){
        if(n==10){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printIncreasing(n+1);
        return;
    }
    
    //print the factorial
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    
    //print nth fibonocci number
    public static int fib(int n){
        if(n<=0)
        return 0;
        
        if(n==1)
        return 1;
        
        return fib(n-1) + fib(n-2);
    }
    
    //check for sorted array
    public static boolean checkSorted(int arr[], int length){
        if(length == 0)
        return true;
        
        return (arr[length] > arr[length-1]) && checkSorted(arr, length-1);
    }
    
    //cover the floor with tiles
    public static int tiling(int n){
        if(n == 0 || n == 1)
        return 1;
        
        // you have area of 2*n and bricks of 2*1 so you can place it vertically and horizontally
        
        int ver = tiling(n-1); 
        int hor = tiling(n-2);
        
        return ver + hor;
    }
    
    //remove duplicates
    public static StringBuilder removeDuplicate(String str, boolean vis[], StringBuilder res, int i, int size){
        if(i == size)
        return res;
        
        if(vis[str.charAt(i) - 'a'] == false){
            res.append(str.charAt(i));
            vis[str.charAt(i)-'a'] = true;
        }
        return removeDuplicate(str, vis, res, i+1, size);
    }
    
    //there are n frient they can either stand alone or in pair, find the no of ways they can stand in single and pair(nC2)
    //take abc: 1(a,b,c), 2(a, (b,c)), 3((a, b), c), 4((a, c), b)
    // public static int friendPairing(int n){
    //     if(n == 1 || n == 2)
    //     return n;
        
    //     //single 
    //     int single = friendPairing(n-1);
        
    //     //pair
    //     int pair = (n-1) * friendPairing(n-2);
        
    //     return single + pair;
        
    //     // return 1 + (n*(n-1))/2; //single(1) + pair(nC2)
    // }
    
    //print binary string with no consecutive ones
    public static void binaryString(int n, String lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        
        binaryString(n-1, "0", str + "0");
        
        if(lastPlace == "0")
        binaryString(n-1, "1", str + "1");
        
        return;
    }
    
    
    
    public static void main(String args[]){
        // printDecreasing(10);
        // printIncreasing(1);
        // System.out.println(fact(5));
        // System.out.println(fib(5));
        
        // int arr[] = {1,2,6,4,5};
        // if(checkSorted(arr, arr.length-1))
        // System.out.println("sorted");
        // else
        // System.out.println("not sorted");
        
        // System.out.println("no of ways to place tiles: " + tiling(5));
        
        // boolean vis[] = new boolean [255];
        // String str = "karankaran";
        // StringBuilder res = new StringBuilder("");
        // System.out.println(removeDuplicate(str, vis, res, 0, str.length()));
        
        
        // System.out.println(friendPairing(3));
        
        // binaryString(3, "0", "");
        
    }
}