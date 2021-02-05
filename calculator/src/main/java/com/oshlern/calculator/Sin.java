package com.oshlern.calculator;

class Sin extends SingleInputFunction {

    public Sin(Function input) {
        super(input);
    }

    protected double _eval(double x) {
        return Math.sin(x);
    }

    protected Function _derivative() {
        return new Cos(input);
    }
}