package dsa.binarysearch;

/** Finds an index whose value is greater than its existing neighbours. */
public class PeakElement {
    static int findPeak(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] > numbers[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 8, 12, 4, 2};
        int index = findPeak(numbers);
        System.out.println("Peak index: " + index);
        if (index != -1) {
            System.out.println("Peak value: " + numbers[index]);
        }
    }
}
