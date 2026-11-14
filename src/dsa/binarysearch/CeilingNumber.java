package dsa.binarysearch;

/** Finds the smallest array value greater than or equal to the target. */
public class CeilingNumber {
    static int ceiling(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return numbers[mid];
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left < numbers.length ? numbers[left] : -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        System.out.println("Ceiling: " + ceiling(numbers, 9));
    }
}
