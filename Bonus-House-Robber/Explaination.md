# House Robber – Problem Solving Reflection

## 1. What was your first thought after reading the problem?

My first thought was to try every possible combination of houses while making sure that adjacent houses are not selected together.

---

## 2. What brute-force solution came to your mind?

I thought of using recursion.

For every house:

* either rob the current house and move two steps ahead,
* or skip the current house and move to the next house.

Then I compare both choices and return the maximum profit.



## 3. What is the time complexity of your solution?

O(2ⁿ)

Because recursion explores many repeated possibilities.



## 4. Can you think of a better solution?

YES

I noticed that many recursive calls were calculating the same results repeatedly.

So I thought of using Dynamic Programming to store previous answers and avoid repeated calculations.



## 5. Where do you think optimization is possible?

Optimization is possible in:

* repeated recursive calculations,
* duplicate work,
* and excessive recursion.
