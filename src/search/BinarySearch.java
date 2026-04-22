package search;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(num, target);
        System.out.println("Element found at index: " + result);
    }

    private static int binarySearch(int[] num, int target) {
        int start =0;
        int end = num.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(num[mid] == target){
                return mid;
            }else if(num[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
       return -1;
    }
}
