package graph;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class test {


    @Test
    public void testMerge() {
        int[] actual = { 0,1,2,0,1,2};
        int[] expected = { 0,0,1,1,2,2};
        App.sortArray(actual);
        assertArrayEquals(expected, actual);
    }
}
