# Animal Shelter
Implemented a FIFO animal shelter.

## Challenge
Create an AnimalShelter using first-in-first-out for dog or cat animal. Implement enqueue and dequeue methods.

## Approach & Efficiency
Created a Node and Animal class. Used the concept of queues for FIFO. 
* Methods:

1. enqueue - Time and Space complexities: 0(1). Add using back pointer.
2. dequeue - Time complexity: 0(n) and Space Complexity: 0(1). Iterate through the list using current and previous pointers.

## API
### Initialization
`AnimalShelter sample = new AnimalShelter()`

### Methods

1.enqueue
* Method to insert a dog or cat to the queue. Parameter is the Animal object.

2.dequeue
* Method to remove and return the preferred animal. Parameter is a string which is either dog or cat.

## Source Code
* ![Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/challenge12.png)
* ![Whiteboard](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/whiteboard12.jpeg)


- [X] Top-level README “Table of Contents” is updated
- [X] Feature tasks for this challenge are completed
- [X] Unit tests written and passing
  - [X] “Happy Path” - Expected outcome
  - [X] Expected failure
  - [X] Edge Case (if applicable/obvious)
- [X] README for this challenge is complete
  - [X] Summary, Description, Approach & Efficiency, Solution
  - [X] Link to code
  - [X] Picture of whiteboard


# Multibracket Validation
Validate brackets ({}, (), []) if balanced or not. Paired with Liz Mahoney.

## Challenge
Given a string, create a multibracketvalidation method that will return boolean if the brackets are balanced or not.

## Approach and Efficiency
* The approach is to put the open brackets to the stack while traversing the character array. If the character is  the closing bracket, check the stack if it is the corresponding pair. To determine if it is the correct pair, the HashMap is utilized. 
* Iteration through the character array takes 0(n) time and 0(n) space complexities in the multibracketvalidation method. 

## API
To use: `MultiBracketValidation.multiBracketValidation(String input)`

### Methods

## Source Code
* ![Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/challenge13.png)
* ![Whiteboard](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/whiteboard13.jpeg)


- [X] Top-level README “Table of Contents” is updated
- [X] Feature tasks for this challenge are completed
- [X] Unit tests written and passing
  - [X] “Happy Path” - Expected outcome
  - [X] Expected failure
  - [X] Edge Case (if applicable/obvious)
- [X] README for this challenge is complete
  - [X] Summary, Description, Approach & Efficiency, Solution
  - [X] Link to code
  - [X] Picture of whiteboard



# FizzBuzz Tree
Convert an integer tree to a FizzBuzz Tree

## Challenge
Write a function called FizzBuzzTree which takes a k-ary tree as an argument:
- If the value is divisible by 3, replace the value with “Fizz”
- If the value is divisible by 5, replace the value with “Buzz”
- If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
- If the value is not divisible by 3 or 5, simply turn the number into a String.

## Approach and Efficiency
Used the recursion with pre-order traversal to check and convert each node. Each node string data was converted to Integer and then evaluated using mod operation to check divisibility.
Time and space complexities: 0(n) with the recursion, since it will loop over the tree element by element. 

## API
fizzBuzzTree - accepts Tree with integer datatype.
To use: `FizzBuzzTree fizzBuzzTree  fizzBuzzTree.fizzBuzz(tree)`


## Whiteboard
* ![Whiteboard](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/whiteboard18.png)


- [X] Top-level README “Table of Contents” is updated
- [X] Feature tasks for this challenge are completed
- [X] Unit tests written and passing
  - [X] “Happy Path” - Expected outcome
  - [X] Expected failure
  - [X] Edge Case (if applicable/obvious)
- [X] README for this challenge is complete
  - [X] Summary, Description, Approach & Efficiency, Solution
  - [X] Link to code
  - [X] Picture of whiteboard


## BLOGS
[Blog1](blog)<br/>
[Blog2](blog/blog2)<br/>
[Blog3](blog/blog3)<br/>
