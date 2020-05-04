package com.kulakov.senla.fifthTask;

import java.util.Scanner;

public class fifthTask {
    public static void getPalindromes(int n) {
        for (int i = 0; i<=n; i++) {
            if (i / 10 < 1) System.out.println(i);
            if ((i !=0) && (i / 10 == i % 10)) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0;
        try {
            System.out.print("Введите N: ");
            x = scanner.nextInt();
            if (x < 0) {
                System.out.println("Значение должно быть больше нуля");
                System.exit(0);
            }
            if (x > 100) {
                System.out.println("Значение должно быть не больше 100");
                System.exit(0);
            }
        }
        catch (Exception e) {
            System.out.println("Неверный ввод");
            System.exit(0);
        }
        getPalindromes(x);

    }
}
