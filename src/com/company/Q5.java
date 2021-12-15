package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int NUMBER_OF_TIMES = 5;
        int value=0, even_sum=0, total=0;

        for (int i = 0 ; i < NUMBER_OF_TIMES; i++) {
            System.out.println("please enter a number: ");
            value = s.nextInt();
            if(value%2 == 0){
                System.out.println(value);
                even_sum += value;
                total++;
            }
        }//endof_loop
        System.out.println("total sum of even values is: "+even_sum);
        System.out.println("total even values is: "+total);

    }//endOf_main
}
