# Two Sum – Problem Solving Reflection

## 1. What was your first thought after reading the problem?

My first thought was to check every possible pair in the array and see if their sum becomes equal to the target.



## 2. What brute-force solution came to your mind?

I thought of using two loops:

* the first loop selects one number,
* and the second loop checks all remaining numbers.

If the sum matches the target, I return the indices.



## 3. What is the time complexity of your solution?

O(n²)

Because nested loops are used.



## 4. Can you think of a better solution?

YES

I thought that repeated searching can be reduced using HashMap.

Instead of checking every pair again and again, I can store numbers and their indices in a map for faster lookup.



## 5. Where do you think optimization is possible?

Optimization is possible in:

* repeated searching,
* extra loops,
* and duplicate comparisons.
