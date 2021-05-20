# Hashtable 

## Challenge
Implement a Hashtable with handling collisions.

## Approach & Efficiency
The approach is to use arrays to store the keys and values. 

## API
* add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
* get: takes in the key and returns the value from the table.
* contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash: takes in an arbitrary key and returns an index in the collection.

## Big O
1. add - with reshashing, space complexity is O(n), time is 0(n) when verifying if they key exists.
2. hash - average time and space are O(1). Worst time is O(n).
3. contains - average time and space are O(1). Worst time is O(n).
4. get - average time and space are O(1). Worst time is O(n).

## Source Codes
[Source Code](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/data-structure/hashtable/app/src/main/java/hashtable/Hashtable.java)
[Source Test](https://github.com/Aseel-Banna/data-structures-and-algorithms/blob/main/data-structure/hashtable/app/src/test/java/hashtable/AppTest.java)


