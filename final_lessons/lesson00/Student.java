import java.util.Arrays;

public class Starter {
  public static void main(String[] args) {
    // test your selection sort
    // print if the test passed or failed
  }

  // ================= SORTING SECTION ==================
  /**
    An implementation of the Selection Sort algorithm. Repeatedly finds the largest
    element of an array and swaps it into place for an unsorted array.

    @param numbers - a list of integers to sort

    @return a sorted list of integers
  */
  public static int[] selectionSort(int[] numbers) {
    
  }

  /**
    Helper function that finds the index of the largest element in the array.

    @param numbers - a list of integers
    @param endIdx - the index to stop searching inclusive

    @return the index of the largest element before or including endIdx
  */
  public static int findIndexOfMax(int[] numbers, int endIdx) {
    int maxIdx = 0;
    for (int i = 0; i <= endIdx; i++) {
      if (numbers[i] > numbers[maxIdx]) {
        maxIdx = i;
      }
    }

    return maxIdx;
  }

  /**
    Helper function that swaps the values of two indices in an array.
    NB: we're using a temp variable here to store the value of numbers[idxA].
    What do you think would happen if we didn't use this temp value?

    @param numbers - a list of integers
    @param idxA - the first index to be swapped
    @param idxB - the second index to be swapped
  */
  public static void swap(int[] numbers, int idxA, int idxB) {
    int temp = numbers[idxA];
    numbers[idxA] = numbers[idxB];
    numbers[idxB] = temp;
  }
  
  // ================= TESTING SECTION ===================
  public static boolean testHappyPath() {
    // define the input and expected output
    int[] input = { 2, 5, 1, 4, 3 };
    int[] expectedOutput = { 1, 2, 3, 4, 5 };

    // sort the input using our implementation
    int[] actualOutput = selectionSort(input);

    // check that the arrays match
    return Arrays.equals(expectedOutput, actualOutput);
  }
}
