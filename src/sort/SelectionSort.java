package sort;

// Selection sort is a simple, comparison-based sorting algorithm that divides the input list into two parts:
//  a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element from the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
//space complexity: O(1) because it only requires a constant amount of additional space for the temporary variable used for swapping.
//best case: O(n^2) when the array is already sorted, as it still requires n passes through the array, and each pass involves n comparisons to find the minimum element.
//worst case: O(n^2) when the array is sorted in reverse order, as it still requires n passes through the array, and each pass involves n comparisons to find the minimum element.
//stable alogrithm: it maintains the relative order of equal elements, meaning that if two elements are equal, they will remain in the same order in the sorted output as they were in the input.
//unstable algorithm: it does not maintain the relative order of equal elements, meaning that if two elements are equal, they may not remain in the same order in the sorted output as they were in the input.

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,6,3,8,9,2,7,5,4,0};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1; // last index of unsorted array why? because we are sorting in ascending order and we want to place the largest element at the end of the unsorted array
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
