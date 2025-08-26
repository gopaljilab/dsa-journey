# Selection Sort – Java Implementation

## 📌 Overview
Selection Sort is a simple, comparison-based sorting algorithm.  
It divides the array into a **sorted part** and an **unsorted part**, repeatedly finding the smallest element from the unsorted part and swapping it with the first element of that part.

---

## 🧠 How It Works
1. Start from the first element.
2. Find the smallest element in the unsorted portion.
3. Swap it with the first element of the unsorted portion.
4. Move the boundary between sorted and unsorted parts one step forward.
5. Repeat until the entire array is sorted.

---

## 📊 Time & Space Complexity

| Case       | Time Complexity | Space Complexity | Stability |
|------------|----------------|------------------|-----------|
| **Best**   | O(n²)          | O(1)             | ❌ Not Stable |
| **Average**| O(n²)          | O(1)             | ❌ Not Stable |
| **Worst**  | O(n²)          | O(1)             | ❌ Not Stable |

---

## 🖥 Example
**Input:**
[5, 3, 4, 1, 2]

**Output:**
[1, 2, 3, 4, 5]


