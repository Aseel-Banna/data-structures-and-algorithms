package data.structure;

import org.junit.Test;

import data.structure.Library;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testLibrary(){
        Library currentLibrary = new Library();
        currentLibrary.insert(1);
        currentLibrary.insert(2);
        currentLibrary.insert(3);

        String expected = "{3} -> {2} -> {1} -> Null";

        assertEquals("Output", expected, currentLibrary.toString());
        System.out.println("Test 1:" + currentLibrary.toString() );
        assertTrue("true", currentLibrary.includes(1));
        assertFalse("false", currentLibrary.includes(5));
    }

    @Test public void testAppend(){
        Library currentLibrary = new Library();

        currentLibrary.insert(1);
        currentLibrary.insert(2);
        currentLibrary.insert(3);
        currentLibrary.append(5);
        currentLibrary.append(7);
        String expected = "{3} -> {2} -> {1} -> {5} -> {7} -> Null";
        System.out.println("Test 2: " + currentLibrary.toString());
        assertEquals("Output", expected, currentLibrary.toString());
    }

    @Test public void testInsertAfter(){
        Library currentLibrary = new Library();

        currentLibrary.insert(1);
        currentLibrary.insert(2);
        currentLibrary.insert(3);
        currentLibrary.append(5);
        currentLibrary.append(7);
        currentLibrary.insertAfter(1, 6);
        String expected = "{3} -> {2} -> {1} -> {6} -> {5} -> {7} -> Null";
        System.out.println("Test 3: " + currentLibrary.toString());
        assertEquals("Output", expected, currentLibrary.toString());
    }

    @Test public void testInsertBefore(){
        Library currentLibrary = new Library();

        currentLibrary.insert(1);
        currentLibrary.insert(2);
        currentLibrary.insert(3);
        currentLibrary.insertAfter(1, 6);
        currentLibrary.insertBefore(3, 4);
        currentLibrary.insertAfter(6,4);
        currentLibrary.append(5);
        currentLibrary.append(7);
        String expected = "{4} -> {3} -> {2} -> {1} -> {6} -> {4} -> {5} -> {7} -> Null";
        System.out.println("Test 4: " + currentLibrary.toString());
        assertEquals("Output", expected, currentLibrary.toString());
    }

    @Test public void testReturnValue(){
        Library currentLibrary = new Library();
        currentLibrary.insert(1);
        currentLibrary.insert(4);
        currentLibrary.insert(1);
        currentLibrary.insert(12);
        currentLibrary.insert(1);

        System.out.println("Test 5 : \nElement at index 3 is "+ currentLibrary.returnValue(3));
        assertEquals(4,currentLibrary.returnValue(3) );

    }

    @Test public void testMergeLibrary(){
        Library currentLibrary = new Library();
        currentLibrary.insert(2);
        currentLibrary.insert(3);
        currentLibrary.insert(1);

        Library library = new Library();
        library.insert(4);
        library.insert(9);
        library.insert(5);

        currentLibrary.zipLists(library);
        System.out.println("Merged Linked List: " +currentLibrary.toString());
        String expected = "{1} -> {5} -> {3} -> {9} -> {2} -> {4} -> Null";
        assertEquals(expected,currentLibrary.toString() );

    }

    @Test public void testMergeLibrary2(){
        Library currentLibrary = new Library();
        currentLibrary.insert(3);
        currentLibrary.insert(1);

        Library library = new Library();
        library.insert(4);
        library.insert(9);
        library.insert(5);

        library.zipLists(currentLibrary);
        System.out.println("Merged Linked List: " +currentLibrary.toString());
        String expected = "{5} -> {1} -> {9} -> {3} -> {4} -> Null";
        assertEquals(expected,library.toString() );

    }

    @Test public void testMergeLibrary3(){
        Library currentLibrary = new Library();
        currentLibrary.insert(2);
        currentLibrary.insert(3);
        currentLibrary.insert(1);

        Library library = new Library();
        library.insert(9);
        library.insert(5);

        currentLibrary.zipLists(library);
        System.out.println("Merged Linked List: " +currentLibrary.toString());
        String expected = "{1} -> {5} -> {3} -> {9} -> {2} -> Null";
        assertEquals(expected,currentLibrary.toString() );

    }
}