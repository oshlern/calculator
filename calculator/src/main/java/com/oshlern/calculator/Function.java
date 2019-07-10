package com.oshlern.calculator;


public abstract class Function {

    abstract public double eval(double x);
    abstract public Function derivative();
}