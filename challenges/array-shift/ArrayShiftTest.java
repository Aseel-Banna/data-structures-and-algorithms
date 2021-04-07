mport arrayshift.ArrayShift;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayShiftTest {

 @Test public void shiftArray() {
         int[] test1=  {2,4,6,8}; 
         int[] test2=  {4,8,15,23,42};
         int[] expect1 ={2,4,5,6,8};
         int[] expect2 ={4,8,15,16,23,42};
        

    System.out.println(Arrays.toString( ArrayShift.shiftArray(test1,5)));

        assertArrayEquals("test expect output is "+expect1,expect1,ArrayShift.shiftArray(test1,5));
        assertArrayEquals("test expect output is "+expect2,expect2,ArrayShift.shiftArray(test2,16));
    }

}
