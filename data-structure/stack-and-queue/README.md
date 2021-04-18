# Stack and Queue

## Challenge
Create a stack and a queue and create methods to deal with them

## Approach & Efficiency
O(1)

## API
### Stack
* push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
* pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
* peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* isEmpty that takes no argument, and returns a boolean indicating whether or not the stack is empty.

### Queue
* *enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
* dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
* peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
* isEmpty that takes no argument, and returns a boolean indicating whether or not the queue is empty.

![Stack Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/stack.png)
![Queue Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/queue.png)


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


# Queue with Stack

## Challenge
Create a PseudoQueue using two stacks. Implement enqueue and dequeue methods.

## Approach & Efficiency
O(n): since it will loop along with the stack length

## API

### Initialization
`PseudoQueue sample = new PseudoQueue()`
### Methods

1.enqueue
* Method to insert value to the queue. 

2.dequeue
* Method to remove and return the top value. No parameter.


![Stack Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/challenge11.png)
![Queue Solution](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/challenges/assets/whiteboard.jpeg)


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