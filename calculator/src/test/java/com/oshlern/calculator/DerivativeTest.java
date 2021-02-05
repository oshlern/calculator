package com.oshlern.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DerivativeTest 
{
    double epsilon = 0.000001;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void add() { 
        double a = 0.;
        double b = 1.;
        // Add adder = new Add(, new Constant(b));
        // assertEquals(adder.eval(0), a+b, epsilon);

        double c = -2.52;
        Add adder_var = new Add(new X(), new Constant(c));
        double x = 4.5;
        assertEquals(adder_var.eval(x), x+c, epsilon);
        // for (i=0;i<=5;) random
    }

    @Test
    public void trig() {
        double a = 0.32;
        Sin sin = new Sin(new X());
        assertEquals(sin.eval(a), Math.sin(a), epsilon);

        X x = new X();
        Add adder = new Add(new Sin(x), new Cos(new Multiply(new Constant(2), x)));
        double b = 0.21;
        assertEquals(adder.eval(b), Math.sin(b) + Math.cos(2*b), epsilon);
        // assertEquals(adder.eval(0., 0.), 0.);
        // assertEquals(adder.eval(-2., 2.), 0.);
        // assertEquals(adder.eval(-10., 3.7), 6.3);
        // for (i=0;i<=5;) random
    }
}
