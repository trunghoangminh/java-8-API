package com.tma.axiomsharing.methodreferences;

public class InstanceMethodParticularObject {

    @FunctionalInterface
    interface ExecuteFunction {
        int execute(int a, int b);
    }

    static class MathUtil {
        public int sum(int a, int b) {
            return a + b;
        }

    }
    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }

    public static void main(String[] args) {
        // =============== Instance method particular object ===============
        int a = 5;
        int b = 10;

        MathUtil mathUtil = new MathUtil();
        // Lambda way
        int sumLambda = doAction(a, b, (a1, b1) -> mathUtil.sum(a1, b1));
        System.out.println(String.format("%s + %s = %s", a, b, sumLambda));

        // Method reference way
        int sumMethodReference = doAction(a, b, mathUtil::sum);
        System.out.println(String.format("%s + %s = %s", a, b, sumMethodReference));
    }
}
