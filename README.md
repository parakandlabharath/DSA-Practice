# DSA Practice

A structured collection of Data Structures and Algorithms practice programs in Java 17.

## Current coverage

### Binary Search
- Standard binary search in a sorted integer array
- Binary search in a sorted string array
- Ceiling and floor of a target
- Insert position
- First and last occurrence, including count
- Peak element in an array
- Median of two sorted arrays

## Project structure

```text
DSA-Practice/
├── README.md
└── src/
    └── dsa/
        └── binarysearch/
            ├── BinarySearch.java
            ├── BinaryStringSearch.java
            ├── CeilingNumber.java
            ├── FloorNumber.java
            ├── InsertPosition.java
            ├── MedianOfTwoSortedArrays.java
            ├── Occurrences.java
            └── PeakElement.java
```

## Run a program

From the repository root:

```bash
javac -d out src/dsa/binarysearch/BinarySearch.java
java -cp out dsa.binarysearch.BinarySearch
```

Replace `BinarySearch` with the class you want to run.

## Notes
- Examples use Java 17 and standard library features only.
- Each class has its own `main` method for easy practice.
- Binary search requires sorted input unless the problem states otherwise.
