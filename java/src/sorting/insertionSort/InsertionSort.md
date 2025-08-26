# Insertion Sort – Java Implementation

## 📌 Overview
Insertion Sort is a simple, comparison-based sorting algorithm.  
It builds the sorted portion of the array **one element at a time** by taking elements from the unsorted part and inserting them into their correct position.

---

## 🧠 How It Works
1. Start from the second element (index 1).
2. Compare it with the elements before it in the sorted portion.
3. Shift larger elements one position to the right.
4. Insert the current element into its correct position.
5. Repeat until the array is sorted.

---

## 📊 Time & Space Complexity

| Case       | Time Complexity | Space Complexity | Stability |
|------------|----------------|------------------|-----------|
| **Best**   | O(n)           | O(1)             | ✅ Stable |
| **Average**| O(n²)          | O(1)             | ✅ Stable |
| **Worst**  | O(n²)          | O(1)             | ✅ Stable |

---

## 🖥 Example
**Input:**
[5, 3, 4, 1, 2]

**Output:**
[1, 2, 3, 4, 5]