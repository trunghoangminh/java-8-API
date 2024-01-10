package com.tma.axiomsharing.defaultmethod;

public class DefaultMethod {

    interface Sayable {
        // default method
        default void say() {
            System.out.println("Hello, this is default method");
        }

        // Abstract method
        void sayMore(String msg);

        static void sayLouder(String msg){
            System.out.println(msg);
        }
    }

    public static class SayClass implements Sayable {
        public void sayMore(String msg) {
            System.out.println(msg);
        }

    }

    public static void main(String[] args) {
        SayClass dm = new SayClass();
        // calling default method
        dm.say();
        // calling abstract method
        dm.sayMore("Hello, this is normal method");
        // calling static method
        Sayable.sayLouder("Hello, this is static method");
    }

}
