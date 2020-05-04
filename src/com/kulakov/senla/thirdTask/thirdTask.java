package com.kulakov.senla.thirdTask;
import java.util.Arrays;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.println("Количество слов в предложении: "+words.length);
        Arrays.sort(words);

        for(String subStr:words) {
            System.out.println(subStr.substring(0, 1).toUpperCase() + subStr.substring(1));
        }
    }
}
