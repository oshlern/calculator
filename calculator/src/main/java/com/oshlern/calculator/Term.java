package com.oshlern.calculator;


public abstract class Term {

    abstract public double eval(double x);

    public abstract Function derivative();

}