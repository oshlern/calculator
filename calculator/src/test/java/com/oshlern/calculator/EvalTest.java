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
        double a = 0.;
        double b = 1.;
        Add adder = new Add(new Constant(a), new Constant(b));

        assertEquals(adder.eval(0), a+b, 0.000001);
        // assertEquals(adder.eval(0., 0.), 0.);
        // assertEquals(adder.eval(-2., 2.), 0.);
        // assertEquals(adder.eval(-10., 3.7), 6.3);
        // for (i=0;i<=5;) random
    }
}
