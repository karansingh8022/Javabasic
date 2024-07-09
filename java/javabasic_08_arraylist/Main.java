import java.util.*;

public class Main{
    public static void swap(ArrayList<Integer> arr, int i, int j){
        Integer temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void main(String args[]){
        // ArrayList<Integer> arr = new ArrayList<>();
        
        //add : O(1)
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        
        //add : O(n)
        // arr.add(1, 7);
        
        //remove : O(n)
        // arr.remove(1);
        
        //set : O(n)
        // arr.set(1, 9);
        
        //get : O(1)
        // System.out.println(arr.get(1));
        
        //sort 
        // Collections.sort(arr); //collections are interfaces, default asc
        // Collections.sort(arr, Collections.reverseOrder()); //for desc
        
        // swap(arr, 1, 2);
        
        // ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        // ArrayList<Integer> row1 = new ArrayList<>();
        // row1.add(1);
        // row1.add(2);
        // mat.add(row1);
        // ArrayList<Integer> row2 = new ArrayList<>();
        // row2.add(3);
        // row2.add(4);
        // mat.add(row2);
        
        // System.out.println(mat);
        
        // for(int i = 0; i<mat.size(); i++){
        //     ArrayList<Integer> list = mat.get(i);
        //     for(int j = 0; j<list.size(); j++){
        //         System.out.print(list.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        
    }
}