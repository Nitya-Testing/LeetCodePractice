# Leetcode Practice

This repository is a Java practice workspace for solving LeetCode-style data structure and algorithm problems. The solutions are grouped mostly by problem-solving pattern, such as sliding window, two pointers, recursion, Kadane's algorithm, and slow/fast pointers.

Most classes are standalone practice files with a `main()` method that demonstrates the solution on sample input.

## Tech Stack

- Java 17
- Maven
- JUnit 5 dependencies are configured, though most current files are written as standalone practice classes rather than formal unit tests.

## Project Structure

```text
leetcode-practice/
+-- pom.xml
+-- src/
|   +-- test/
|       +-- java/
|           +-- recursion/
|           +-- recursionPractice16thFeb/
|           +-- recursionPractice7thMarch/
|           +-- resursionPractice/
|           +-- resursionPractice21Feb/
|           +-- slidingwindow/
|           +-- slidingWindowPractice/
|           +-- slidingWindowPractice11thApril/
|           +-- slidingWindowByPratush/
|           +-- slidingWindown4thApril/
|           +-- slidingWindownPractice/
|           +-- twopointerByPratush/
|           +-- twoPointerPractice/
|           +-- kadaneAlgorithm/
|           +-- kadaneAlgorithmPractice/
|           +-- slowFastPointer/
|           +-- practice/
+-- target/
```

## Topics Covered

### Recursion

Examples:

- Balanced parentheses
- Subsets and unique subsets
- Permutations with spaces
- Letter case permutation
- Tower of Hanoi
- Josephus problem
- K-th symbol in grammar
- Print numbers using recursion
- Sort array using recursion

Relevant packages:

- `recursion`
- `recursionPractice16thFeb`
- `recursionPractice7thMarch`
- `resursionPractice`
- `resursionPractice21Feb`
- `practice`

### Sliding Window

Examples:

- Maximum sum subarray of size K
- First negative number in every window
- Maximum of all subarrays of size K
- Longest substring without repeating characters
- Longest substring with K unique characters
- Minimum window substring
- Largest subarray with given sum
- Pick toys pattern
- Minimum size subarray sum

Relevant packages:

- `slidingwindow`
- `slidingWindowPractice`
- `slidingWindowPractice11thApril`
- `slidingWindowByPratush`
- `slidingWindown4thApril`
- `slidingWindownPractice`
- `practice`

### Two Pointers

Examples:

- Two sum
- Two sum with duplicates
- Three sum / triplet sum
- Triplet sum close to target
- Triplets with smaller sum
- Squares of a sorted array
- Sort colors / Dutch national flag
- Remove duplicates
- Merge two sorted arrays
- Container with most water

Relevant packages:

- `twopointerByPratush`
- `twoPointerPractice`

### Kadane's Algorithm

Examples:

- Maximum subarray sum
- Minimum subarray sum
- Maximum product subarray
- Maximum subarray sum with one deletion
- Maximum subarray sum with two deletions

Relevant packages:

- `kadaneAlgorithm`
- `kadaneAlgorithmPractice`

### Slow/Fast Pointer

Examples:

- Happy number
- Find duplicate number

Relevant package:

- `slowFastPointer`

## How to Build

From the project root:

```bash
mvn clean test
```

This compiles the Java files and runs Maven's test lifecycle.

## How to Run a Practice Class

Most solutions include a `main()` method. You can run them from an IDE such as IntelliJ IDEA or Eclipse by opening the class and running its `main()` method.

You can also run a class from Maven/Java tooling after compilation, for example:

```bash
mvn test
```

Then run the desired class from your IDE or terminal using its fully qualified package name.

## Current Notes

- The code is primarily for learning and revision, not production use.
- Some package and class names contain spelling mistakes, such as `resursion`, `Windown`, `Negetive`, and `Grammer`. They are kept as-is in this README to match the current source files.
- The project already includes JUnit dependencies, so a good next improvement would be converting the sample `main()` checks into formal unit tests.

## Suggested Next Improvements

- Add JUnit tests for each algorithm.
- Move reusable algorithm methods into `src/main/java`.
- Keep tests under `src/test/java`.
- Normalize package and class names.
- Add problem links or notes for each LeetCode/GFG-style question.
- Track time and space complexity in each solution.
