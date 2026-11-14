package dsa.binarysearch;

/** Finds the first/last index of a target and counts its occurrences. */
public class Occurrences {
    private static int findBound(int[] numbers, int target, boolean findFirst) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                answer = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    static int[] searchRange(int[] numbers, int target) {
        return new int[] {
            findBound(numbers, target, true),
            findBound(numbers, target, false)
        };
    }

    static int count(int[] numbers, int target) {
        int[] range = searchRange(numbers, target);
        return range[0] == -1 ? 0 : range[1] - range[0] + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 2, 3, 4, 5};
        int[] range = searchRange(numbers, 2);
        System.out.println("First index: " + range[0]);
        System.out.println("Last index: " + range[1]);
        System.out.println("Count: " + count(numbers, 2));
    }
}
