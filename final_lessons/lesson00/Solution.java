import java.util.Arrays;

public class Solution {
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
    /**
      DELIBERATE ERROR: it's possible that numbers is null. This is a 
      suggested test case after the code along. Let students handle
      that extension on their own.
    */

    // COMMENT: we make a copy here so we don't modify the original.
    int[] sortedNumbers = numbers;
    
    /**
      PROVIDE: we loop backward here to make sure we don't accidentally
      swap an element that was already swapped into the correct place.
    */
    for (int idxToSwap = sortedNumbers.length - 1; idxToSwap > 0; idxToSwap--) {
      /**
        BIG-REVEAL: Because we're using well-made helper functions, this
        is the entire logic of our selection sort. It follows the description
        talked about in class exactly.
      */
    
      // STUDENT-PROMPT: use the function we worked on!
      int maxIdx = findIndexOfMax(idxToSwap);
      
      // STUDENT-PROMPT: use the function we worked on!
      // BIG-IDEA: the swap function is what DOES the sorting!
      swap(sortedNumbers, idxToSwap, maxIdx);
    }
  }

  /**
    Helper function that finds the index of the largest element in the array.

    @param numbers - a list of integers
    @param endIdx - the index to stop searching inclusive

    @return the index of the largest element before or including endIdx
  */
  public static int findIndexOfMax(int[] numbers, int endIdx) {
    // QUESTION: why are we setting maxIdx to 0 here? what if we set it to -1?
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

    @param numbers - a list of integers
    @param idxA - the first index to be swapped
    @param idxB - the second index to be swapped
  */
  public static void swap(int[] numbers, int idxA, int idxB) {
    /**
      MUST-ANSWER: we're using a temp variable here to store the value of
      numbers[idxA]. What do you think would happen if we didn't use this temp value?
    */
    int temp = numbers[idxA];
    numbers[idxA] = numbers[idxB];
    numbers[idxB] = temp;
  }
  
  // ================= TESTING SECTION ===================
  /**
    BIG-IDEA: this is how we test code! we come up with an example
    input and expected output for that input. then we pass the
    input to function to sort and checked that the provided
    output matches the expected output.
  */
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
