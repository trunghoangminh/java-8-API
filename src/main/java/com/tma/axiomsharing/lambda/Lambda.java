package com.tma.axiomsharing.lambda;

import com.tma.axiomsharing.functionalinterface.IntegerConverter;

public class Lambda {
    public static void main(String[] args) {

        // ================ Java interface ================
        // Normal way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };

        // Use lambda
        Runnable runnableLambda = () -> System.out.println("Hello world");

        // ================ Custom interface ================
        // Normal way
        IntegerConverter integerConverter = new IntegerConverter() {
            @Override
            public int calculate(String s) {
                return Integer.parseInt(s);
            }
        };

        // Use lambda
        IntegerConverter integerConverterLambda = (s) -> Integer.parseInt(s);
    }
}
