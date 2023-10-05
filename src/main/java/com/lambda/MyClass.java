package com.lambda;

public class MyClass {


    public static void main(String[] args) {

        MyFunctionInterface f1 = (a, b) -> {
            return a + b;
        };
        System.out.println(f1.sums(2, 6));

        //2nd option

        MyFunctionInterface f2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(f2.sums(3, 3));


        Runnable runnable = () -> {

            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };

        Thread t = new Thread(runnable);
        t.start();
    }
}
