package com.company;

import java.util.Scanner;

public class Sadna23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;

        System.out.println("enter natural number");
        n = input.nextInt();

        for(int i=1; i<n; i++) {
            if (i % 3 == 0)
                System.out.println(i);

        }//end of for loop

    }
}
