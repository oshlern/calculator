package com.oshlern.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvalTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void add() {
        adder = new Add();
        assertEquals(adder.eval(0., 1.), 1.);
        assertEquals(adder.eval(0., 0.), 0.);
        assertEquals(adder.eval(-2., 2.), 0.);
        assertEquals(adder.eval(-10., 3.7), 6.3);
        // for (i=0;i<=5;) random
    }
}
