package com.kulakov.senla.secondTask;
import java.util.Scanner;

public class secondTask {
    public static int nok(int a, int b){
        int i;
        int x = (a > b) ? a : b;
        for (i=x; i<=a*b; i++) {
            if ((i % a == 0) && (i % b == 0) && (i != 0)) return i;
        }
        return i;
    }
    public static int nod(int a, int b){
        if (b == 0)
            return a;
        return nod(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0, b=0;
        try {
            System.out.print("Введите первое число: ");
            a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            b = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Неверный ввод");
            System.exit(0);
        }

        System.out.println("НОК равно: " + nok(a,b));
        System.out.println("НОД равно: " + Math.abs(nod(a,b)));
    }
}
