# Selection Sort

Selection sort is an algorithm that used to sort an array ascending.

## Pseudo Code
```SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1  
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;```
        
## Trace 
Sample Array: [9,5,27,7,5,6] <br/>

Pass 1:
In the first pass through of the selection sort, we evaluate if there is a smaller number in the array than what is currently present in index 0. We find this smaller number right away in index 1. The minimum value gets updated to remember this index. At the end of the evaluation, the smaller number will be swapped with the current value in index i. This results in our smallest number of our array being placed first.
[9,5,27,7,5,6] ---> [5,9,27,7,5,6]
* min = 0 , j = 1, temp = 5

Pass 2:
The second pass through the array evaluates the remaining values in the array to see if there is a smaller value other than the current position of i. 5 is the 2nd smallest and equal to the first number in the array, so it “swaps” with the second index. The minimum value does not change at all during the iteration of this pass.
[5,9,27,7,5,6] ---> [5,5,27,7,9,6]
* min = 1 , j = 2, temp = 5

Pass 3:
The third pass through evaluates the remaining indexes in the array, starting at position 2. Position 3, 4 and 5 are smaller than the value in position 2. Each time a smaller number than the current minimum is found, the variable will update to the new smallest number. In this case, 15 is the next smallest number. As a result, it will swap with position 2.
[5,5,27,7,9,6] ---> [5,5,6,7,9,27]
* min = 2 , j = 3, temp = 6

Pass 4: 
The 4th pass through on the array proves that 7 is the next smallest number in the array, and as a result, it is already sorted.
* min = 3 , j = 4, temp = 7

Pass 5: 
The 5th pass through of the array proves that 9 is the next smallest number in the array, and as a result, it is already sorted.
* min = 4 , j = 5, temp = 9

Pass 6:
The 6th and last pass through of the array proves that 27 is the largest number in the array, and as a result, it is already sorted.
* min = 5 , j = 6, temp = 9

## Efficiency
Time: O(n^2)
The basic operation of this algorithm is comparison. This will happen n * (n-1) number of times…concluding the algorithm to be n squared.
Space: O(1)
No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).

