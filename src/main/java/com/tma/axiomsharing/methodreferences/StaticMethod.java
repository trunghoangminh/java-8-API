package com.tma.axiomsharing.methodreferences;

public class StaticMethod {

    @FunctionalInterface
    interface ExecuteFunction {
        int execute(int a, int b);
    }

    static class MathUtil {
        public static int sum(int a, int b) {
            return a + b;
        }
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }

    public static void main(String[] args) {
        // =============== Static method reference ===============
        int a = 5;
        int b = 10;

        // Lambda way
        int sumLambda = doAction(a, b, (a1, b1) -> MathUtil.sum(a1, b1));
        System.out.println(String.format("%s + %s = %s", a, b, sumLambda));

        // Method reference way
        int sumMethodReference = doAction(a, b, MathUtil::sum);
        System.out.println(String.format("%s + %s = %s", a, b, sumMethodReference));
    }

}
