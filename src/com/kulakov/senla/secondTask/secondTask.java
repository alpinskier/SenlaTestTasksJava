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
/*
        обработка нулевых чисел:
        1. если оба числа нулевые, то очевидно, что НОК для них найти невозможно (на ноль делить нельзя)
        НОД для них найти невозможно, так как у нуля бесконечное количество делителей.
        2. если одно из чисел ноль, а второе не ноль, то НОК найти невозможно, НОД будет равено второму числу
 */
        if ((a == 0) && (b == 0)) {
            System.out.println("Числа не могут быть нулевыми");
            System.exit(0);
        } else
        if (((a == 0) && (b != 0)) || ((b == 0) && (a != 0))) {
            System.out.println("НОК не существует!");
            System.out.println("НОД равно: " + Math.abs(nod(a,b)));
            System.exit(0);
        } else
        System.out.println("НОК равно: " + nok(a,b));
        System.out.println("НОД равно: " + Math.abs(nod(a,b)));
        //при поиске НОД необходиимо выводить ответ по модулю, так как в противном случае
        // при подаче на вход отрицательных чисел функця будет давать отрицательный ответ,
        // но по определению НОДом является именно НАИБОЛЬШИЙ общий делитель, то результат надо брать по модулю
    }
}
