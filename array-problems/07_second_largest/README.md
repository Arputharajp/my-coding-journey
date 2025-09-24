# Find Second Largest Element

## Problem
Write a Java program to find the second largest element in an array.

## Example
Input: int[] arr = {5, 2, 9, 1, 7}  
Output:
Second largest element: 7


## Approach
1. Initialize two variables `largest` and `secondLargest`.  
2. Iterate through the array:  
   - If the current element > `largest`, set `secondLargest = largest` and `largest = current element`.  
   - Else if current element > `secondLargest` and != `largest`, set `secondLargest = current element`.  
3. Print the `secondLargest` value.  

## Solution
See `solution.java` for implementation.
