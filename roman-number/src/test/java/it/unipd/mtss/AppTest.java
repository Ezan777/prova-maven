package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testName() {
        assertEquals("Enrico", app.getName());
    }

    @Test
    public void testSurname() {
        assertEquals("Zangrando", app.getSurname());
    }

    @Test
    public void testIdNumber() {
        assertEquals(2000547, app.getIdNumber());
    }

    @Test
    public void testAge() {
        assertEquals(23, app.getAge());
    }

    @Test
    public void testPresentation() {
        assertEquals("I am Enrico Zangrando, id 2000547 and I am 23 years old", app.presentation());
    }

    @Test
    public void testDogName() {
        assertEquals("Peggy", app.getDogName());
    }

    @Test
    public void testStarWars() {
        assertEquals("Revenge of the Sith", app.getFavouriteStarWars());
    }

    @Test
    public void testGame() {
        assertEquals("RDR2", app.getFavouriteGame());
    }

    @Test
    public void testCartoon() {
        assertEquals("Kung Fu Panda", app.getFavouriteCartoon());
    }

    @Test
    public void testConsole() {
        assertEquals("PS5", app.getFavouriteConsole());
    }

    @Test
    public void testLinux() {
        assertEquals("Arch", app.getFavouriteLinux());
    }

    @Test
    public void testMobileOs() {
        assertEquals("Android", app.getFavouriteMobileOS());
    }
}
