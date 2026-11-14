package dsa.binarysearch;

/** Returns the index of target, or where it should be inserted in sorted order. */
public class InsertPosition {
    static int searchInsert(int[] numbers, int target) {
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
        return left;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        System.out.println("Insert position: " + searchInsert(numbers, 2));
    }
}
