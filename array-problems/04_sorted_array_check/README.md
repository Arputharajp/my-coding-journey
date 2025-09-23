# Check if Array is Sorted

## Problem
Write a Java program to check if an array is sorted in ascending order.

## Example
Input: int[] arr = {1, 2, 3, 4, 5}  
Output: Input: int[] arr = {5, 3, 4, 1}  
Output:
Is sorted: true
Input: int[] arr = {5, 3, 4, 1}  
Output: 
Is sorted: false
## Approach
1. Initialize a boolean variable `sorted` as `true`.  
2. Iterate through the array from index 0 to length-2.  
3. Compare each element with the next one.  
4. If any element is greater than the next, set `sorted` to `false` and break.  
5. Print the result.  

## Solution
See `solution.java` for implementation.
