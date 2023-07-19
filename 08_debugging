# Debugging Activity
### by A to Z

Main objective: Focus on students practicing print statement debugging

Given starter code for an ArrayList partial implementation, students will be tasked to
implement two functions: one to swap values at specified indices and one to remove all instances of an item from the ArrayList. Both functions must be "homebrew" implementations. 

The implementation of the swapElements function will be delivered in a code-along style that teaches students how to debug using print statements and modeling (physical or using a drawing). The implementation of the removeValue function will be assigned as classwork for students.

## Instructions

### Implementing swapElements

- Either prompt students for their initial guess on how to swap to variables. If this
  guess is the correct implementation, ask students why the following implementation may
  not work:
  ```java
  public static void swapElements(dataList, index1, index2) {
    dataList[index1] = dataList[index2];
    dataList[index2] = dataList[index1];
  }
  ```

- Explain to students that we can't print an ArrayList directly in Java since it is an
  object. Ellicit that we can see "inside" of the ArrayList using print statements.  
  
- Instruct students to add a print statement for all expressions
  ```java
  ... {
    print("initial values: " + dataList[index1] + ", " + dataList[index2]);
    
    dataList[index1] = dataList[index2];
    print("value of index1 after swap: " + dataList[index1]);
    print("value of index2 after swap: " + dataList[index2]);

    dataList[index2] = dataList[index1];
    print("value of index1 after swap: " + dataList[index1]);
    print("value of index2 after swap: " + dataList[index2]);
  }
  ```

- Model how swapping works in real life by either drawing an example depicting the
  internals of the ArrayList or holding two objects in your hands. Explain to students
  you can't swap to elements without storing one elsewhere.

- Using what we've gained from our print statement debugging and physical modeling, ask
  students how we can "hold on to" the old value of dataList[index1]. Answer or ellicit:
  setting a temporary variable.

- Instruct students to make this change and add print statements to reflect this.
  ```java
  ... {
    int temp = dataList[index1];
    print("initial values (dataList[index1], dataList[index2], temp): ")
    print("(" + dataList[index1] + ", " + dataList[index2] + ", " + temp + ")");
    
    dataList[index1] = dataList[index2];
    print("value of index1 after swap: " + dataList[index1]);
    print("value of index2 after swap: " + dataList[index2]);
    print("value of temp after swap: " + temp);

    dataList[index2] = temp;
    print("value of index1 after swap: " + dataList[index1]);
    print("value of index2 after swap: " + dataList[index2]);
    print("value of temp after swap: " + temp);
  }
  ```

### Implementing removeValue

Now that students have seen an example of using print statements or modeling (physically or using a drawing) to implement a method, have them 
implement removeValue on their own. Require them to show where they need to place the print statements.
