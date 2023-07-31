/**
  Name: 
  Date:
  Activity: Merge Sort

  - Comments with the "TODO" header are tasks to be completed.
  - Comments with the "HINT" header are there to help you.
  - There are tests for Merge Sort and the helper merge function
    in main to make sure things work.
*/

public class Solution {
  public static void main(String[] args) {
    System.out.println("------ Running mergeArrays tests -----");
    System.out.println("Happy path: " + testMergeArrays_HappyPath());
    System.out.println("Empty left array: " + testMergeArrays_EmptyLeft());
    System.out.println("Empty right array: " + testMergeArrays_EmptyRight());
    
    System.out.println("------- Running mergeSort tests ------");
    System.out.println("Happy path: " + testMergeSort_HappyPath());
    System.out.println("Backward array: " + testMergeSort_BackwardArray());
    System.out.println("All duplicates: " + testMergeSort_AllDuplicates());   
  }

  /**
    ========================== TODO ==========================
    Using the description below as a guide, write a function
    called "mergeArrays" that merges two sorted arrays of
    integers in sorted order, and returns the result. Your
    function must:
      - accept two arrays of integers as a parameters
      - return the merged array in sorted order

    ===================== MERGING STEPS ======================
    1. Create an array to store the result of the merged
       input arrays.
    2. Loop through both of the input arrays simultaneously.
       You want to be able access both of their elements at
       the same time.
    3. For every index, compare the current value in the
       first input array to the current value in the second
       input.
    4. Add the smaller value found in Step 3 to the result
       array.
    5. Repeat Steps 2-4 until one of the arrays is empty.
    6. Add the remaining elements to the result array.
    7. Return the result array created.
  
    ========================= HINT ==========================
    Creating multiple variable to track the current index
    being processed in all three arrays is helpful.
  */
  public static void mergeArrays(int[] leftArr, int[] rightArr) {
    // ========== STEP 1 ===============
    int[] mergedArr = new int[leftArr.length + rightArr.length];

    // Taken from the hint for ease.
    int leftIdx = 0;
    int rightIdx = 0;
    int mergedIdx = 0;

    // ============ STEP 2 ===============
    while (leftIdx < leftArr.length & rightIdx < rightArr.length) {
      // ============ STEP 3 ==========
      /** 
        If the current item in leftArr is smaller than the current
        item of rightArr, then it should be inserted next.
      */
      if (leftArr[leftIdx] < rightArr[rightId]) {
        mergedArr[mergedIdx] = leftArr[leftIdx];
        leftIdx++;
      }

      /**
        If the current item in rightArr is less than *OR* equal to
        the current item in leftArr, then it should be inserted next.
      */
      if (rightArr[rightIdx] <= leftArr[leftId]) {
        mergedArr[mergedIdx] = rightArr[rightId];
        rightIdx++;
      }

      // since we've inserted an item, adjust the mergedIdx
      mergedIdx++;      
    }

    /**
      ============== STEP  6 ============
      If any items remain in either array, we know that they are all
      bigger than what was in the other array. In this case, just
      append them to the mergedArr.
    */

    // insert whatever items remain in leftArr
    while (leftIdx < leftArr.length) {
      mergedArr[mergedIdx] = leftArr[leftIdx];
      mergedIdx++;
      leftIdx++;
    }

    // insert whatever items remain in rightArr
    while (rightidx < rightArr.length) {
      mergedArr[mergedIdx] = rightArr[rightIdx];
      mergedIdx++;
      rightIdx++;
    }

    // ================ STEP 7 ============
    return mergedArr;
  }
    

  /**
    ========================== TODO ==========================
    Using the description below as a guide, write a working
    implementation of the Merge Sort algorithm that sorts an
    array of integers. Your implementation must:
      - accept an array of integers as a parameter, but you
        are free to add other parameters you find helpful
      - use recursion
      - return a sorted array of integers      

    ============== MERGE SORT STEPS =================
    1. If the array only has one element, it is sorted.
    2. Calculate what index represents the middle of the array.
    3. Using that index, sort the left half and the right half.
    4. Merge the sorted left and right halves together in sorted order.
    5. Return the sorted, merged array.

    ================ HINT ====================
    Since Merge Sort works on the same array but only processes a small 
    window of numbers, you may find it helpful to include start and end
    indices for the function as parameters.
  */ 
  public static int[] mergeSort(int[] arr, int leftIdx, int rightIdx) {
    /**
      ============== STEP 1 ==============
      If leftIdx == rightIdx, that means we're only looking at one element.
      Return since this is sorted already.

      If leftIdx > rightIdx, that means we've already sorted everything
      in the original array. Again, return the array since it's sorted
      already.
    */
    if (leftIdx >= rightIdx) {
      return arr;
    }

    /**
      ============== STEP 2 ===========
      Finding the middle index of the array. Note that leftIdx is added
      to make sure we're in bounds. Consider what would happen if we didn't
      add leftIdx to the result:
        - leftIdx = 3
        - rightIdx = 6
        - midIdx = (rightIdx - leftIdx) / 2 = (6 - 3) / 2 = 1 OUT OF BOUNDS!!!
    */
    int midIdx = leftIdx + (rightIdx - leftIdx) / 2;

    /** ============== STEP 3 ============= */
    int[] leftArr = mergeSort(arr, leftIdx, midIdx);
    int[] rightArr = mergeSort(arr, midIdx, rightIdx);


    /** =========== STEP 4 ================= */
    int[] sortedArr = mergeArray(leftArr, rightArr);


    /** ========== STEP 5 ================= */
    return sortedArr;    
  }
}