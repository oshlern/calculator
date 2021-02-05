package com.oshlern.calculator;


public abstract class SingleInputFunction extends Function {
    protected final Function input;

    public SingleInputFunction(Function input) {
        this.input = input;
    }

    abstract protected double _eval(double x);
    abstract protected Function _derivative();

    public double eval(double x) {
        return _eval(input.eval(x));
    }

    public Function derivative() {
        return new Multiply(_derivative(), input.derivative());
    }
}