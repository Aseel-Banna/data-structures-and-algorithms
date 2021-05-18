# QuickSort

QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. 

## Pseudo Code 

ALGORITHM QuickSort(arr, left, right)
    `if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)`

ALGORITHM Partition(arr, left, right)
  `  // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)`

    ` // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1`

`ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp`

## Trace
Sample Array: [8,4,23,42,16,15]<br/>

* Let's suppose we pick 8 as the pivot for simplicity
* We'll first put all elements less than 8 in the first position of the array: {4,8, 15, 16, 23, 42}
* We'll then repeat it for the left sub-array {4}, taking 4 as the pivot
* There are no elements less than 4
* We apply quicksort on the sub-array in the right of the pivot, i.e. {4}
* This sub-array consists of only one sorted element
* We continue with the right part of the original array, {15, 16, 23, 42} until we get the final ordered array

## Efficiency
In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n).<br/> Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each.<br/> As a result, the QuickSort algorithm has the complexity of O(n log n).

In the worst case, the algorithm will select only one element in each iteration, so O(n) + O(n-1) + … + O(1), which is equal to O(n^2).

On the average QuickSort has O(n log n) complexity.
