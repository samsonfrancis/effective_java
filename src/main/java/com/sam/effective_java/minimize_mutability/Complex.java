package com.sam.effective_java.minimize_mutability;

import lombok.Getter;

public final class Complex {
    @Getter
    private final double re;
    @Getter
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Complex add(Complex c){
        return new Complex(re + c.re, im + c.im);
    }
    public Complex subtract(Complex c){
        return new Complex(re - c.re, im - c.im);
    }
    public Complex multiply(Complex c){
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }
    public Complex devide(Complex c){
        double tmp =  c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im)/ tmp, (im*c.re - re * c.im) / tmp);
    }
    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof  Complex)){
            return false;
        }
        Complex c = (Complex)o;
        return Double.compare(re,c.re) == 0 && Double.compare(im,c.im) == 0;
    }
}
