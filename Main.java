package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int range = (num-2) / 44;
        switch (range) {
            case 0:
                System.out.println("Number is in 0-44");
                break;
            case 1:
                System.out.println("number is in 45 -> 89 range");;
                break;
            case 2:
                System.out.println("number is in 90 -> 134 range");
                break;
            default:
                System.out.println("number is in other range");
                break;
        }
    }
}

