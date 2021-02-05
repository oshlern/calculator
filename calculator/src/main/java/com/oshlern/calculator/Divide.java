package com.oshlern.calculator;

class Divide extends Function {
    protected Function numerator;
    protected Function denominator;

    public Divide(Function numerator, Function denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double eval(double x) {
        return numerator.eval(x)/denominator.eval(x);
    }

    public Function derivative() {
        Function LdH = new Multiply(denominator, numerator.derivative());
        Function HdL = new Multiply(numerator, denominator.derivative());
        return new Divide(new Add(LdH, HdL), new Square(denominator));
    }
}