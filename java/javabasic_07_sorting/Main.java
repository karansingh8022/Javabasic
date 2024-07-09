import java.util.*;

public class Main{
    public static void mergeSort(int arr[], int start, int mid, int end){
        int m = mid - start + 1;
        int n = end - mid;
        
        int left[] = new int[m];
        int right[] = new int[n];
        
        for(int i = 0; i<m; i++){
            left[i] = arr[i + start]; //add start in arr not left as it may affect with m and n
        }
        
        for(int i = 0; i<n; i++){
            right[i] = arr[i + mid + 1];
        }
        
        int i = 0, j = 0, k = start;
        
        while(i<m && j<n){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else if(left[i] > right[j]){
                arr[k++] = right[j++];
            }
            else{
                arr[k++] = left[i++];
                arr[k++] = right[j++];
            }
        }
        
        while(i < m){
            arr[k++] = left[i++];
        }
        
        while(j < n){
            arr[k++] = right[j++];
        }
        
        return;
    }
    
    public static void merge(int arr[], int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            merge(arr, start, mid);
            merge(arr, mid+1, end);
            mergeSort(arr, start, mid, end);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {2,5,7,1,3,8};
        merge(arr, 0, arr.length-1);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}