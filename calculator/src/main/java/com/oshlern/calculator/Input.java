package com.oshlern.calculator;

class Input extends Function {

    public double eval(double x) {
        return x;
    }

    public Function derivative() {
        return new Constant(1);
    }
}