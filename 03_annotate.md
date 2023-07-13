# Class Assumptions 
Class is familiar with:
- ArrayList (get, set, etc.)
- for loops and while loops

```java
  // PROVIDE function signature
	// DELIBERATE ERROR: omit type signature of each parameter
  public int linearSearch(
    int value,

    // STUDENT-PROMPT activating background knowledge

    // DELIBERATE ERROR not using the Integer wrapper class
    ArrayList<Integer> data)
  {
    // STUDENT-PROMPT "We know we're going to return an integer called foundIndex - when are we going to declare it? What should it be?"
    
    int foundIndex = -1;

		// STUDENT-PROMPT:
		// "How do we want to go through the ArrayList?" Implicit: for vs while.
		// BIG IDEA in the worst case, we have to go through the whole array to find the target index. 
    for (int i=0; i < data.size(); i++) {

			// STUDENT-PROMPT
			// "What should we check for each member of the ArrayList?" 
      int e = data.get(i);

      // BEEG REVEAL: this conditional does the heavy lifting of finding the index of the value.
      if (e == value) {
        // DELIBERATE ERROR:
				// foundIndex = e (return value instead of index)
        foundIndex = i;

        // COMMENT using break vs. using return. is one better than the other?
        break;
        }
      }
    
		// PROVIDE return statement
    return foundIndex;
  }
```
