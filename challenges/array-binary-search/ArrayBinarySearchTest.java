import arraybinarytest.ArrayBinarySearchTest;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayShiftTest {

 @Test public void arrayBinarySearch() {
         int[] test1= {4,8,15,16,23,42}; 
         int[] test2= {11,22,33,44,55,66,77};
        

    System.out.println(ArrayBinarySearch.BinarySearch(test1,15));

        assertArrayEquals("test expect output is "+expect1,expect1,ArrayBinarySearch.BinarySearch(test1,5));
        assertArrayEquals("test expect output is "+expect2,expect2,ArrayBinarySearch.BinarySearch(test2,16));
    }

}
