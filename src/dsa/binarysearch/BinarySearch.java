package dsa.binarysearch;

/** Iterative binary search on a sorted integer array. */
public class BinarySearch {
    static int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;
        System.out.println("Index: " + search(numbers, target));
    }
}
