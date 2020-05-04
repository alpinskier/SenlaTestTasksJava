package com.kulakov.senla.fourthTask;
import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String upperText = text.toUpperCase()+" ";
        String upperWord = word.toUpperCase();

        String[] tmp = upperText.split(upperWord);

        System.out.println("Количество вхождений слова  в текст: " + (tmp.length-1));
    }
}
