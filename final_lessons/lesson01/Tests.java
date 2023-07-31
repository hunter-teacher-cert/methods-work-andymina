public class Tests {
  /** ============= MERGE ARRAYS TESTS =================== */
  public static String testMergeArrays_HappyPath() {
    int[] leftArr = { 1, 2, 3 };
    int[] rightArr = { 4, 5, 6 };
    int[] expectedOutput = { 1, 2, 3, 4, 5, 6 };
    
    int[] actualOutput = mergeArrays(leftArr, rightArr);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
    
  }

  public static String testMergeArrays_EmptyLeft() {
    int[] leftArr = {};
    int[] rightArr = { 1, 2, 3 };
    int[] expectedOutput = rightArr;

    int[] actualOutput = mergeArrays(leftArr, rightArr);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
  }

  public static String testMergeArrays_EmptyRight() {
    int[] leftArr = { 4, 5, 6 };
    int[] rightArr = {};
    int[] expectedOutput = leftArr;

    int[] actualOutput = mergeArrays(leftArr, rightArr);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
  }

  /** ============= MERGE SORT TESTS =================== */
  public static String testMergeSort_HappyPath() {
    int[] input = { 4, 561, 51, 34, 68 };
    int[] expectedOutput = { 4, 34, 51, 68, 561 };
    int[] actualOutput = input;

    mergeSort(actualOutput, 0, actualOutput.length - 1);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
  }

  public static String testMergeSort_BackwardArray() {
    int[] input = { 41, 34, 29, 29, 5};
    int[] expectedOutput = {5, 29, 29, 34, 41};
    int[] actualOutput = input;

    mergeSort(actualOutput, 0, actualOutput.length - 1);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
    
  }

  public static String testMergeSort_AllDuplicates() {
    int[] input = { 28, 28, 28, 28, 28 };
    int[] expectedOutput = input;
    int[] actualOutput = input;

    mergeSort(actualOutput, 0, actualOutput.length - 1);

    return Arrays.equal(actualOutput, expectedOutput) ? " PASSED ✅" : " FAILED ❌";
  }
}