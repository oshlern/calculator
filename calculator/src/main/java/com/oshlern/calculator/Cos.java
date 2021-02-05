package com.oshlern.calculator;

class Cos extends SingleInputFunction {

    public Cos(Function input) {
        super(input);
    }

    protected double _eval(double x) {
        return Math.cos(x);
    }

    protected Function _derivative() {
        return new Sin(input);
    }
}