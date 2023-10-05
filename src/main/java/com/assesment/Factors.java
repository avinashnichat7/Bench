package com.assesment;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the no");
        int no = scanner.nextInt();


    for (int i=1; i<=no; i++) {
        if(no%i==0){

            System.out.println(i);
        }

    }
    }
}
