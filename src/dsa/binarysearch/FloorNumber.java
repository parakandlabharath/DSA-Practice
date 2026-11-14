package dsa.binarysearch;

/** Finds the largest array value less than or equal to the target. */
public class FloorNumber {
    static int floor(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] <= target) {
                answer = numbers[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        System.out.println("Floor: " + floor(numbers, 9));
    }
}
