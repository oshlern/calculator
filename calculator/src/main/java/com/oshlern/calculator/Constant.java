package com.oshlern.calculator;

class Constant extends Function {
    public final double value;

    public Constant(double value) {
        this.value = value;
    }

    public double eval(double x) {
        return value;
    }

    public Function derivative() {
        return new Constant(0);
    }
}