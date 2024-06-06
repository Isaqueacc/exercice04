package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, qtd;
        System.out.println("digite a quantidade de numeros: ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("digite o número: ");
             vect [i] = sc.nextInt();
        }
        System.out.println("numeros pares: ");
            qtd = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i]%2 ==0 ){
                System.out.println(vect[i]);
                qtd++;
         }
        }
            System.out.printf("quantidade de pares: " + qtd);

        }
    }