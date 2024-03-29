/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testDog(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "dog";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals(newDog.type,  animalShelter.dequeue("dog"));
    }

    @Test public void testCat(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "cat";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals(newDog.type, animalShelter.dequeue("cat"));
    }

    @Test public void testMouse(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "mouse";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals("It should be cat or dog!", animalShelter.dequeue("mouse"));
    }

    @Test public void testNull(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "cat";
        System.out.println(animalShelter.dequeue("cat"));
        assertEquals(null, animalShelter.dequeue("cat"));
    }

    @Test public void testEnqueue(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "rabbit";
        assertEquals("rabbit", animalShelter.enqueue("rabbit"));
        assertEquals("It should be cat or dog!" , animalShelter.dequeue("rabbit"));
    }

    @Test public void testEnqueueRabbit(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "rabbit";
        assertEquals("rabbit", animalShelter.enqueue("rabbit"));
        assertEquals("It should be cat or dog!" , animalShelter.dequeue("rabbit"));
    }

    @Test public void testEnqueueMain(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "rabbit";
        assertEquals("Camel", animalShelter.enqueue("Camel"));

    }
}
