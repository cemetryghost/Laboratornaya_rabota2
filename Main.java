package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("X: ");
        int x = in.nextInt();
        while (x >-2){
            System.out.print("X: ");
            x = in.nextInt();
        }
        System.out.print("N: ");
        int n = in.nextInt();
        while (n <0){
            System.out.print("N: ");
            n = in.nextInt();
        }
        double b = 0;
        for (int i=0; i<n+1; i++){
            double c = Math.pow(-1, i+1);
            double c1 = Math.pow(x, 2*i+1);
            b += c/((2*i+1)*c1);
        }
        System.out.print(b -(Math.PI/2));
    }
}
