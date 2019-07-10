package com.oshlern.calculator;

class Add extends Function {
    protected Function[] inputs;

    public Add(Function... inputs) {
        this.inputs = inputs;
    }

    public double eval(double x) {
        double out = 0.;
        for (Function input : inputs) {
            out += input.eval(x);
        }
        return out;
    }

    public Function derivative() {
        Function[] terms = new Function[inputs.length];
        for (int i=0; i<inputs.length; i++) {
            terms[i] = inputs[i].derivative();
        }
        return new Add(terms);
    }
}