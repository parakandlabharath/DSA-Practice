package dsa.binarysearch;

/** Finds the median of two sorted arrays in O(log(min(m, n))) time. */
public class MedianOfTwoSortedArrays {
    static double findMedian(int[] first, int[] second) {
        if (first.length > second.length) {
            return findMedian(second, first);
        }
        if (first.length == 0 && second.length == 0) {
            throw new IllegalArgumentException("Both arrays cannot be empty.");
        }

        int m = first.length;
        int n = second.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int cutFirst = low + (high - low) / 2;
            int cutSecond = (m + n + 1) / 2 - cutFirst;

            int leftFirst = cutFirst == 0 ? Integer.MIN_VALUE : first[cutFirst - 1];
            int rightFirst = cutFirst == m ? Integer.MAX_VALUE : first[cutFirst];
            int leftSecond = cutSecond == 0 ? Integer.MIN_VALUE : second[cutSecond - 1];
            int rightSecond = cutSecond == n ? Integer.MAX_VALUE : second[cutSecond];

            if (leftFirst <= rightSecond && leftSecond <= rightFirst) {
                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(leftFirst, leftSecond)
                            + Math.min(rightFirst, rightSecond)) / 2;
                }
                return Math.max(leftFirst, leftSecond);
            } else if (leftFirst > rightSecond) {
                high = cutFirst - 1;
            } else {
                low = cutFirst + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays must be sorted.");
    }

    public static void main(String[] args) {
        int[] first = {1, 3};
        int[] second = {2, 4};
        System.out.println("Median: " + findMedian(first, second));
    }
}
