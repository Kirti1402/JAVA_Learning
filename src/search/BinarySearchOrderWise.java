package search;

public class BinarySearchOrderWise {
    public static void main(String[] args) {
        int num[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 8;
        int result = binarySearch(num, target);
        System.out.println("Element found at index: " + result);
    }

    private static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        boolean isAsc = num[start]<num[end];


        while(start<end){
            int mid = start + (end-start)/2;
            if(num[mid] == target){
                return mid;
            }
          if(isAsc){
            if(num[mid]<target){
                start = mid+1;
            }else{
                end= mid-1;
            }
          }else{
            if(num[mid]>target){
                start=mid+1;
            }else{
                end=mid-1;
            }
          }
        }
        return -1;
    }
}
