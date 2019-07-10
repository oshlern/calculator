package com.oshlern.calculator;

class Constant extends Term {

    public double value;

    public Constant(double value) {
        this.value = value;
    }

    public double eval(double x) {
        return value;
    }

    public Term derivative() {
        return new Constant(0);
    }
}