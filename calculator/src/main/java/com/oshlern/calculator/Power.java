package com.oshlern.calculator;

class Power extends Function {
    protected Function base;
    protected Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public double eval(double x) {
        return Math.pow(base.eval(x), exponent.eval(x));
    }

    public Function derivative() {// b(x)^p(x) = e^p(x)lnb(x); ( p'(x)lnb(x) + b'(x)p(x)/b(x) ) b(x)^p(x),
        Function[] terms = new Function[inputs.length];
        for (int i=0; i<inputs.length; i++) {
            Function[] temp_inputs = inputs;
            temp_inputs[i] = inputs[i].derivative();
            terms[i] = new Power(temp_inputs);
        }
        return new Add(terms);
    }
}