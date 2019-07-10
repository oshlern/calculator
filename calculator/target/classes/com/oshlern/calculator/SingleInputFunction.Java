package com.oshlern.calculator;


public abstract class SingleInputFunction extends Function {
    protected final Function input;

    public SingleInputFunction(Function input) {
        this.input = inputs;
    }

    abstract protected double eval(double x);
    abstract protected Function derivative();

    public double eval(double x) {
        return eval(input.eval(x));
    }

    public Function derivative() {
        return new Multiply(derivative(), input.derivative());
    }
}