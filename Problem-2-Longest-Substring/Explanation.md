# Longest Substring Without Repeating Characters – Problem Solving Reflection

## 1. What was your first thought after reading the problem?

My first thought was to generate all possible substrings and check whether they contain repeated characters or not.



## 2. What brute-force solution came to your mind?

I thought of using nested loops to generate substrings.

I used a HashSet to store characters and check whether a character was already repeated.

If a repeated character was found, I stopped checking that substring.



## 3. What is the time complexity of your solution?

O(n²)

Because nested loops are used to check multiple substrings.



## 4. Can you think of a better solution?

YES

I thought repeated checking can be reduced using the Sliding Window technique.

Using HashMap helps track characters and avoid checking the same characters again and again.



## 5. Where do you think optimization is possible?

Optimization is possible in:

* repeated character checking,
* extra loops,
* and duplicate work.
