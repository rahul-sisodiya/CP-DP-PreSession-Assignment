# Two Sum – Explanation

## First Thought

My first idea was to check every pair in the array and see if their sum is equal to the target.



## Brute Force Approach

I used two loops:

* first loop picks one element,
* second loop checks the remaining elements.

If the sum matches the target, I return the indices.

### Time Complexity

O(n²)

---

## Optimization Idea

I noticed that I was searching again and again in the array.

To reduce this repeated work, I used a HashMap.


## Optimized Approach

I stored numbers and their indices in a HashMap.

For every element:

* I calculated the required value,
* checked whether it already existed in the map,
* and returned the answer if found.

### Time Complexity

O(n)

---

## What I Learned

This problem helped me understand:

* brute force vs optimized approach,
* how HashMap improves searching,
* and how optimization reduces time complexity.

---
