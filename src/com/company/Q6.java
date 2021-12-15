package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int NUMBER_OF_WARD = 6;
        int patients = 0, max = Integer.MIN_VALUE;
        double avg=0, sum=0;

        for (int i = 0 ; i < NUMBER_OF_WARD; i++) {
            System.out.println("please patients amount in the ward: ");
            patients = s.nextInt();

            sum += patients;
            if(patients > max)
                max = patients;
        }
        System.out.println("the average patients in the hospital is: "+(sum/NUMBER_OF_WARD));
        System.out.println("biggest ward capacity is: "+max);
    }
}
