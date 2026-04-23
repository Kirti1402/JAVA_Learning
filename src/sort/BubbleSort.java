package sort;

import java.util.Arrays;

// Bubble sort is a simple, comparison-based sorting algorithm that repeatedly steps through a list, 
// compares adjacent elements, and swaps them if they are in the wrong order
//space complexity: O(1) because it only requires a constant amount of additional space for the temporary variable used for swapping.
//best case: O(n) when the array is already sorted, as it only requires one pass through the array to verify that it is sorted.
//worst case: O(n^2) when the array is sorted in reverse order, as it requires n passes through the array, and each pass involves n comparisons and potential swaps.
//stable alogrithm: it maintains the relative order of equal elements, meaning that if two elements are equal, they will remain in the same order in the sorted output as they were in the input.
//unstable algorithm: it does not maintain the relative order of equal elements, meaning that if two elements are equal, they may not remain in the same order in the sorted output as they were in the input.
public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {1,6,3,8,9,2,7,5,4,0};
        bubbleSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;                    
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // No swaps means the array is already sorted
  
            }
        }
    }
}
