package com.oshlern.calculator;

class Multiply extends Function {
    protected Function[] inputs;

    public Multiply(Function... inputs) {
        this.inputs = inputs;
    }

    public double eval(double x) {
        double out = 1.;
        for (Function input : inputs) {
            out *= input.eval(x);
        }
        return out;
    }

    public Function derivative() {
        Function[] terms = new Function[inputs.length];
        for (int i=0; i<inputs.length; i++) {
            Function[] temp_inputs = inputs;
            temp_inputs[i] = inputs[i].derivative();
            terms[i] = new Multiply(temp_inputs);
        }
        return new Add(terms);
    }
}