package com.company;

public class Main {

    public static void main(String[] args) {
        Parent p1 = new Parent("Cohen Avi",
                "02-5551010");

        Parent p2 = new Parent("Cohen Avi",
                "02-5551010");


        System.out.println(p1.isEqual(p2));

    }
}
