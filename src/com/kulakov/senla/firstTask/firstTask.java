package com.kulakov.senla.firstTask;
import java.util.Scanner;

public class firstTask{
    public static boolean isPrimeNumber(int num) {
        int tmp;
        for (int i = 2; i <= num/2; i++) {
            tmp = num % i;
            if (tmp == 0) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x=0;
        try {
            x = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Неверный ввод");
            System.exit(0);
        }

        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное");
        } else {
            System.out.println("Число " + x + " нечетное");
        }
/*  в условиях задачи ничего не сказано про отрицательные числа. значит на входе могут быть и они.
    в то же время простыми могут быть только натуральные, а составными натуральные большие единицы
    значит в выводе должны предусмотреть ответ при подаче на вход отрицательных чисел
 */
        if (x < 2) System.out.println("Число "+ x + " не относится ни к простым, ни к составным числам"); else
        if (isPrimeNumber(x))
            System.out.println("Число "+ x + " простое"); else
            System.out.println("Число "+ x + " составное");
    }
}