package com.oshlern.calculator;


public abstract class Function extends Term {

    protected final Function[] inputs;

    public Function() {
        inputs = new Function[3];
    }
    public Function(Function[] inputs) {
        this.inputs = inputs;
    }

    abstract public double compute(double x);

    // public double eval(double x) {
    //     inputs.compute(x);
    // }

    public abstract Function derivative();

}