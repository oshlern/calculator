package com.oshlern.calculator;

class X extends Function {

    public X() {}

    public double eval(double x) {
        return x;
    }

    public Function derivative() {
        return new Constant(1);
    }
}