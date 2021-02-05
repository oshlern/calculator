package com.oshlern.calculator;

class Tan extends SingleInputFunction {

    public Tan(Function input) { // Define as a division of sin and cos? How do I make the Tan constructor forward to that?
        super(input);
    }

    protected double _eval(double x) {
        return Math.tan(x);
    }

    protected Function _derivative() {
        return new Cos(input);
    }
}