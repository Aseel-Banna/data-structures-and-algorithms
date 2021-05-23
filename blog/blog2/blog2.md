# Merge Sort

Merge sort is one of the algorithms that is used to sort an array by divided the array for two parts left and right and sort each array alone.

## Pseudo Code
`ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left`


## Trace 
Sample Array: [8,4,23,42,16,15] <br/>

* At the beginning, n, which is the length of the array, is bigger than 1. So, n = 6 and mid = 3 which is 42 as an index.
* The left array length will be from 0 to the mid, which is 3. And the right array length will be 3 too.
* Left array = [8,4,23]
* Right array = [42,16,15]
* Then it will be inserted to the same function, which is mergeSort to be sorted. 
* Left array = [4,8,23]
* Right array = [15,16,42]
* Then it will be inserted to other function, which is merge.
* The merge will sort the arrays by comparing indexes for each one with the other. 
* I will compare each item in the array:
* Left[0] < Right[0] ---> no
* Then the arr[0] = 4
* Left[1] < Right[0] ---> no
* Then the arr[1] = 8
* Left[2] < Right[0] ---> yes
* Then the arr[2] = 15
* Left[2] < Right[1] ---> yes
* Then the arr[3] = 16
* Left[2] < Right[3] ---> no
* Then the arr[3] = 23
* The left array is ended. So, no more compare with it.
* At the end the last element in the right array will be the last element in the array which is 42.
* The final array will be [4,8,15,16,23,42]

## Efficiency
As merge sort is a recursive algorithm, the time complexity can be expressed as the following recursive relation:<br/>

`T(n) = 2T(n/2) + O(n)`<br/>
2T(n/2) corresponds to the time required to sort the sub-arrays and O(n) time to merge the entire array.<br/>

When solved, the time complexity will come to O(nLogn).

WHY: The input is repeatedly halved, every time you insert an array as an input it will divide it for two parts from half so the complexity is O(Log(n)). And n items are iterated log n times.
So, the complexity will be O(n*Log(n)).

