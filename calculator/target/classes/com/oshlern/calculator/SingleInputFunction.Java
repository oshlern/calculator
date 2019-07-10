package com.oshlern.calculator;


public abstract class SingleInputFunction extends Function {
    protected final Function input;

    public SingleInputFunction(Function input) {
        this.input = inputs;
        this.inputs = {input};
    }

    abstract public double eval(double x);

    abstract protected Function make_derivative();

    public Function derivative() {
        return new Multiply(this.make_derivative(), this.input.derivative());
    }
}