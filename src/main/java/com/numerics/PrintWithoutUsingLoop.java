package com.numerics;

public class PrintWithoutUsingLoop {
//    static void printNum(int num) {
//
//        if (num <= 10) {
//            System.out.println(num);
//            printNum(num + 1);
//        }

//    }
    public static void main(String[] args) {
        printNums(5);

//        for (int i = 0; i <= 10; i++) {
//            System.out.println("num= " + i);
//        }
    }

    static void printNums(int N) {
        if (N ==0) return;

        printNums(N -1);
        System.out.print(N +" ");

    }

}



