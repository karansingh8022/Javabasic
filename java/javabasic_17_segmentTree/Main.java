import java.util.*;

public class Main{
    static int tree[];
    
    //constructing segment tree
    // public static void init(int n){
    //     tree = new int[4*n];
    // }
    // public static int buildST(int arr[], int i, int start, int end){
    //     if(start == end){
    //         tree[i] = arr[start];
    //         return arr[start];
    //     }
    //     int mid = start + (end - start)/2;
    //     int left = buildST(arr, 2*i+1, start, mid);
    //     int right = buildST(arr, 2*i+2, mid+1, end);
    //     tree[i] = left + right;
    //     return tree[i];
    // }
    
    //build max segment tree
    public static void initMaxST(int n){
        tree = new int[4*n];
    }
    public static int buildMaxST(int arr[], int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = start + (end - start)/2;
        int left = buildMaxST(arr, 2*i+1, start, mid);
        int right = buildMaxST(arr, 2*i+2, mid+1, end);
        tree[i] = Math.max(left, right);
        return tree[i];
    }
    
    //queries
    // public static int get(int i, int ss, int se, int qs, int qe){
    //     //non overlapping
    //     if(qs >= se || qe <= ss){
    //         return 0;
    //     }
    //     //complete overlapping
    //     else if(qs <= ss && qe >= se){
    //         return tree[i];
    //     }
    //     //partial overlap
    //     else{
    //         int mid = ss + (se-ss)/2;
    //         int left = get(2*i+1, ss, mid, qs, qe);
    //         int right = get(2*i+2, mid+1, se, qs, qe);
    //         return left + right;
    //     }
    // }
    // public static int getSum(int arr[], int qs, int qe){
    //     int n = arr.length;
    //     return get(0, 0, n-1, qs, qe);
    // }
    
    //queries for get max st
    public static int getMax(int i, int ss, int se, int qs, int qe){
        //non overlapping
        if(qs >= se || qe <= ss){
            return Integer.MIN_VALUE;
        }
        //complete overlapping
        else if(qs <= ss && qe >= se){
            return tree[i];
        }
        //partial overlap
        else{
            int mid = ss + (se-ss)/2;
            int left = getMax(2*i+1, ss, mid, qs, qe);
            int right = getMax(2*i+2, mid+1, se, qs, qe);
            return Math.max(left, right);
        }
    }
    public static int getMaxSt(int arr[], int qs, int qe){
        int n = arr.length;
        return getMax(0, 0, n-1, qs, qe);
    }
    
    //update 
    // public static void up(int i, int ss, int se, int idx, int diff){
    //     if(idx < ss || idx > se){
    //         return;
    //     }
        
    //     tree[i] += diff;
        
    //     if(ss != se){
    //         int mid = ss + (se - ss)/2;
    //         up(2*i+1, ss, mid, idx, diff);
    //         up(2*i+2, mid+1, se, idx, diff);
    //     }
    //     return;
    // }
    // public static void update(int arr[], int idx, int newValue){
    //     int diff = newValue - arr[idx];
    //     arr[idx] = newValue;
    //     int n = arr.length;
        
    //     up(0, 0, n-1, idx, diff);
    //     return;
    // }
    
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5,6,7,8};
        // int n = arr.length;
        // init(n);
        // buildST(arr, 0, 0, n-1);
        
        // for(int i = 0; i<tree.length; i++){
        //     System.out.print(tree[i] + " ");
        // }
        // System.out.println();
        
        // System.out.print(getSum(arr, 2, 5));
        // System.out.println();
        
        // update(arr, 2, 2);
        
        // for(int i = 0; i<tree.length; i++){
        //     System.out.print(tree[i] + " ");
        // }
        // System.out.println();
        
        // System.out.print(getSum(arr, 2, 5));
        
        
        
        
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        initMaxST(n);
        buildMaxST(arr, 0, 0, n-1);
        
        // for(int i = 0; i<tree.length; i++){
        //     System.out.print(tree[i] + " ");
        // }
        // System.out.println();
        
        System.out.println(getMaxSt(arr, 2, 5));
    }
    
}



