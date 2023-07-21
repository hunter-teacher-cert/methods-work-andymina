# Lessson 00 Sketch

## Description

**Course:** AP Computer Science A

**Grade-level:** 11-12th Grade

**Lesson:** Exploring Sorting Algorithms

**Essential Question:** What is a sorting algorithm and when should I use one?

**Materials:**

- [ ] A deck of cards
- [ ] Computer with Java environments
- [ ] Rubber duck to debug

## Class Assumptions

Before this lesson, students should be able to:

- identify the time and space complexity of simple iterative functions
(for-loops, doubly nested for-loops, etc.) in Big-O notation

- demonstrate reasonable control over arrays including, but not limited to,
the following functionality:
  - appending an item to an array
  - removing an item from an array
  - looping through an array
  - accessing elements by index
  - changing elements by index

## Student Objectives

By the end of this lesson, students will be able to:

- define what a sorting algorithm is
- identify applications of sorting, both in the real world and in computers
- write a simple sorting algorithm for a list of numbers
  - depending on the level of the class, either `BubbleSort` or `SelectionSort`
    could be used as the simple sorting algorithms. this lesson plan uses `SelectionSort`.
- talk about the time and space complexity of specific sorting algorithms
  using Big-O notation

## Rough Gameplan

### Warm-up | < 5m

Students will be asked to complete one of the three following tasks:

1. Recall a time you've sorted **anything** in real life. Think carefully about the steps you took to do so. Write one example of the different methods we use to sort items.
    - Consider that we may use different methods to sort different items
        - playing cards in your hand
        - books on a shelf
        - papers in a folder
        - etc.

2. If you know already, define what a sorting algorithm is. List 1-3 examples of sorting algorithms you may know and describe in 1-2 sentences how they work.

3. What might be some practical use cses for sorting an array in code? Think about how this may apply to websites, video games, or other forms of digital media you may have encountered. Write down 3-5 use
cases of sorting in the digital world.

### Presentation of Content | < 10m

#### Background Knowledge

Ask students the context in which they’ve sorted items before and what was the metric for sorting
used. Did they sort

- books alphabetically on a shelf?
- playing cards by their value in their hand?
- members of their family by height?

Encourage students who answered Warm-up #1 to share their responses. Emphasize that sorting is
done by using a comparative metric whether it be alphabetically or by some quantitative value
(height, money, grades, etc.).

#### Definitions

- Define a sorting algorithm. Encourage students who answered Warm-up #2 to share their responses.
- Define the following vocabulary:
  - **non-decreasing**: the order of the items either increases OR remains the same as you move through
  the list
  - **increasing**: the order of the items will ALWAYS increase as you move through the list

  - **non-increasing**: the order of the items either descreases OR remains the same as you move through
  the list
  - **decreasing**: the order of the items will ALWAYS decrease as you move through the list
- Give students examples of the above definitions:
  - non-decreasing list: `[1, 2, 2, 3]`
  - increasing list: `[1, 2, 8, 11]`
  
  - non-increasing list: `[49, 17, 17, 2]`
  - decreasing list: `[4, 3, 2, 1]`

#### Applications in the Digital World

Focus the conversation on computer science and ask students why they might sort items when
programming. Encourage students who answered Warm-up #3 to share their responses.
Provide examples: “Take Spotify (or any other music streaming platform). We can sort songs in a
playlist by a few different metrics: date added, length, number of global listens, and most notably, alphabetically.”

### Writing a Sorting Algorithm | < 15m

Students are given starter code with some basic test cases for sorting an array of integers defined
*(method: scaffolding)*. Explain to students that we're going to write a sorting algorithm
called `SelectionSort`. Show students how SelectionSort works using a deck of cards
*(method: unplugged activity/modeling)*.

Once students understand how SelectionSort works, conduct a code-along session using student-input
as the driving force *(method: code-along)*. Stop for questions and comments as needed. Plan an off-by-one error in the code to practice rubber duck debugging as a class *(method: debugging)*.

### Testing and Debugging | < 2m

When students have implemented their SelectionSort algorithm, instruct them to use the tests given
to them to check that their code works. They should also come up with interesting test cases to try
and break their code.

Encourage students to swap seats and write test cases to test everyone's sorting algorithm.

### Time and Space Complexity | < 8m

Students should already be familiar with Big-O notation. Walk students through deriving the Big-O
time complexity for SelectionSort.

Inform students that although Big-O is commonly used to talk about time complexity, it can also be
used to talk about space complexity. Ask students about the space this algorithm uses. Walk them
through deriving the Big-O space complexity for SelectionSort.

### Debrief | < 5m

Briefly recap and review:
- what a sorting algorithm is
- when we might want to use one in the digital world
- how SelectionSort works
- time/space complexity of SelectionSort
