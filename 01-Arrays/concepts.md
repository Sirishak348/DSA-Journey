📚 Arrays — Concepts & Fundamentals

«A structured collection of notes covering Array fundamentals, operations, problem-solving techniques, and important patterns in Data Structures and Algorithms.»

Learning Resource: Striver's A2Z DSA Sheet
Programming Language: Java
Status: In Progress

---

📌 Table of Contents

1. Introduction to Arrays
2. Array Declaration and Initialization
3. Accessing and Updating Elements
4. Array Traversal
5. Array Operations
6. Types of Arrays
7. Time and Space Complexity
8. Important Array Techniques
9. Java Arrays Utility Class
10. Problem-Solving Approach
11. Key Takeaways

---

1. Introduction to Arrays

An Array is a linear data structure that stores multiple elements of the same data type in a fixed-size collection.

Each element is accessed using an index, starting from "0".

Example

Array: [10, 20, 30, 40, 50]

Index:   0   1   2   3   4
Value:  10  20  30  40  50

Characteristics

- Stores elements of the same data type.
- Uses zero-based indexing.
- Provides constant-time access using an index.
- Java arrays have a fixed length after creation.
- Elements are stored in an indexed sequence.
- Supports efficient traversal and searching.

Advantages

- Fast random access.
- Easy to traverse.
- Simple implementation.
- Useful for implementing other data structures.

Limitations

- Fixed size after initialization.
- Insertion and deletion may require shifting elements.
- Searching an unsorted array may take linear time.

---

2. Array Declaration and Initialization

Declaration

int[] arr;

Initialization

arr = new int[5];

Declaration and Initialization Together

int[] arr = {10, 20, 30, 40, 50};

Creating an Array with a Specific Size

int[] arr = new int[5];

Default values for an "int" array are "0".

Accessing Array Length

System.out.println(arr.length);

Note: "length" is a property, not a method.

---

3. Accessing and Updating Elements

Accessing an Element

int[] arr = {10, 20, 30, 40};

System.out.println(arr[2]); // 30

Updating an Element

arr[1] = 25;

Updated array:

[10, 25, 30, 40]

Important

Valid indices range from:

0 to arr.length - 1

Accessing an invalid index causes "ArrayIndexOutOfBoundsException".

---

4. Array Traversal

Traversal means visiting each element of an array.

Using a For Loop

int[] arr = {10, 20, 30, 40, 50};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

Using an Enhanced For Loop

for (int num : arr) {
    System.out.println(num);
}

Complexity

- Time Complexity: O(n)
- Auxiliary Space Complexity: O(1)

---

5. Basic Array Operations

Operation| Time Complexity
Access by index| O(1)
Update by index| O(1)
Traversal| O(n)
Linear Search| O(n)
Binary Search (sorted array)| O(log n)
Insertion at end (if space exists)| O(1)
Insertion at beginning| O(n)
Deletion from beginning| O(n)
Finding maximum element| O(n)
Finding minimum element| O(n)

---

6. Types of Arrays

6.1 One-Dimensional Array

A simple linear collection of elements.

int[] arr = {1, 2, 3, 4, 5};

6.2 Two-Dimensional Array

An array organized into rows and columns.

int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Accessing an element:

System.out.println(matrix[1][2]); // 6

Traversing a 2D Array

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

6.3 Jagged Array

A two-dimensional Java array in which different rows can have different lengths.

int[][] arr = {
    {1, 2},
    {3, 4, 5},
    {6}
};

---

7. Important Array Problem-Solving Techniques

7.1 Brute Force Approach

The straightforward method of solving a problem, often by checking all possible combinations.

Example: Two Sum using nested loops.

- Time Complexity: O(n²)
- Auxiliary Space Complexity: O(1)

7.2 Two Pointer Technique

Uses two indices to process an array efficiently.

Common applications:

- Pair sum in a sorted array.
- Removing duplicates.
- Reversing an array.
- Moving zeros to the end.

7.3 Hashing

Uses a HashSet or HashMap to store values or frequencies.

Common applications:

- Finding duplicates.
- Two Sum.
- Frequency counting.
- Finding missing elements.

Typical average lookup complexity in HashMap: O(1).

7.4 Prefix Sum

Stores cumulative sums to answer range-sum queries efficiently.

For an array:

arr = [2, 4, 6, 8]

Prefix Sum = [2, 6, 12, 20]

Formula:

prefix[i] = prefix[i - 1] + arr[i]

Range sum from index "l" to "r":

prefix[r] - prefix[l - 1]

For "l = 0", the range sum is simply "prefix[r]".

7.5 Sliding Window

Maintains a window over a sequence to solve problems involving contiguous subarrays.

Applications:

- Maximum sum subarray of size K.
- Minimum-length subarray satisfying a condition.
- Longest substring or subarray under suitable constraints.

7.6 Kadane's Algorithm

Used to find the maximum sum of a contiguous subarray.

Core idea:

currentSum = max(arr[i], currentSum + arr[i])

maxSum = max(maxSum, currentSum)

- Time Complexity: O(n)
- Auxiliary Space Complexity: O(1)

7.7 Sorting

Sorting arranges array elements in a particular order.

Common algorithms:

Algorithm| Average Time Complexity
Bubble Sort| O(n²)
Selection Sort| O(n²)
Insertion Sort| O(n²)
Merge Sort| O(n log n)
Quick Sort| O(n log n)

---

8. Java Arrays Utility Class

Java provides the "Arrays" class in the "java.util" package.

import java.util.Arrays;

Common Methods

Method| Purpose
"Arrays.sort(arr)"| Sorts an array
"Arrays.toString(arr)"| Converts array to readable string
"Arrays.equals(a, b)"| Compares array contents
"Arrays.fill(arr, value)"| Fills array with a value
"Arrays.binarySearch(arr, key)"| Searches a sorted array
"Arrays.copyOf(arr, length)"| Copies an array

Example:

int[] arr = {5, 2, 4, 1, 3};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));

Output:

[1, 2, 3, 4, 5]

---

9. Problem-Solving Approach

Before solving an array problem, follow these steps:

1. Understand the problem statement.
2. Identify input constraints.
3. Think of the brute-force approach.
4. Analyze time and space complexity.
5. Identify possible optimization techniques.
6. Write the optimal solution.
7. Test edge cases.
8. Analyze complexity again.

Important Edge Cases

- Empty array, if permitted by constraints.
- Single element.
- Duplicate elements.
- Already sorted array.
- Reverse sorted array.
- Negative numbers.
- All elements equal.
- Maximum and minimum allowed values.

---

10. Key Takeaways

- Arrays provide O(1) random access.
- Array traversal generally requires O(n) time.
- Insertion and deletion can require shifting elements.
- Two pointers and hashing are important optimization techniques.
- Prefix sums help with cumulative and range-sum queries.
- Sliding window is useful for suitable contiguous subarray problems.
- Kadane's algorithm solves maximum subarray sum in linear time.
- Choosing the right approach is more important than simply writing code.

---

Goal: Master array fundamentals and problem-solving patterns through consistent practice using Striver's A2Z DSA Sheet.
