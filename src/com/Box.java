package com;

public class Box <T >{
    private T a;
    private T b;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public  Box  (T a, T b) {
        this.a = a;
        this.b = b;
        
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public static <T> T generetic(T a){

return a;
    }

}
