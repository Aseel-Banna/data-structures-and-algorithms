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
