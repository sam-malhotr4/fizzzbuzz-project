package org.example;

import static org.example.App.fizzBuzz;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkFizzBuzzNormalNumbers(){
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    public void checkFizzBuzzForMultiplesOf3(){
        assertEquals("Fizz", fizzBuzz(3));
    }

}
