package dsa.binarysearch;

/** Binary search in a lexicographically sorted string array. */
public class BinaryStringSearch {
    static int search(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = words[mid].compareTo(target);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "grape", "mango", "orange"};
        System.out.println("Index: " + search(words, "mango"));
    }
}
