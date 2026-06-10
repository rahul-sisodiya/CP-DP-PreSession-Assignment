# Climbing Stairs – Problem Solving Reflection

## 1. What was your first thought after reading the problem?

My first thought was to try every possible way of climbing the stairs using recursion.



## 2. What brute-force solution came to your mind?

I thought of using recursion where:

* from every step,
* I can either climb 1 stair or 2 stairs.

Then I recursively calculate all possible ways.



## 3. What is the time complexity of your solution?

O(2ⁿ)

Because the recursive function keeps calling itself multiple times.



## 4. Can you think of a better solution?

YES

I noticed that the same calculations were happening repeatedly in recursion.

So I thought of storing previous results and using Dynamic Programming to avoid repeated work.



## 5. Where do you think optimization is possible?

Optimization is possible in:

* repeated recursive calculations,
* duplicate work,
* and excessive recursion.
