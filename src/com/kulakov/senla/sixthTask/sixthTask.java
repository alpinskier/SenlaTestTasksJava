package com.kulakov.senla.sixthTask;

import java.util.Scanner;
public class sixthTask {

    public static class Item {
        double cost, weight;
        public Item(double cost, double weight) {
            this.cost = cost;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите грузоподъемность рюкзака: ");
        Scanner scanner = new Scanner(System.in);
        double bagCapacity = scanner.nextDouble();
        //так как в задаче про тип данных ничего не сказано, то для вес и стоимости будем испольовать double
        System.out.print("Введите количество предметов: ");
        int itemsCount = scanner.nextInt();
        Item[] item = new Item[itemsCount];
        for (int i = 0; i<=itemsCount-1; i++) {
            double cost, weight;
            System.out.print("Введите вес "+ (i+1) + "-го предмета: ");
            weight = scanner.nextDouble();
            System.out.print("Введите стоимость "+ (i+1) + "-го предмета: ");
            cost = scanner.nextDouble();
            item[i] = new Item(cost, weight);
        }
        double maxCost = 0; // тут будем хранить максимальную ценность набора
        double itemsWeight = 0; // тут будем хранить вес искомого набора
        int maxSet = 0; // тут будем хранить номер искомого набора (перестановки)
        // делаем полный перебор. очевидно, что количество перестановок будет 2 в степени количества предметов
        for (int i=1; i<Math.pow(2, itemsCount); i++){
            double tempCost = 0; double tempWeight = 0;
            for (int j=0; j<=itemsCount; j++) {
                int mask = 1 << j;
                if ((i & mask) > 0) {
                    tempCost += item[j].cost;
                    tempWeight += item[j].weight;
                }
            }
            if (tempCost > maxCost && tempWeight <= bagCapacity) {
                maxCost = tempCost;
                maxSet = i;
                itemsWeight = tempWeight;
            }
        }
// так как в задаче не указано точно что именно должно быть на выходе, то выведем максимальную ценность,
// вес полученного набора и предметы, которые можно поместить в сумку
        System.out.println("Макиммальая ценность: " + maxCost);
        System.out.println("Вес полученного набора: " + itemsWeight);
// вывод предметов, которые надо пололжить в сумку
        for (int i=1; i<=itemsCount; i++) {
            int mask = 1 << i-1;
            if ((maxSet & mask) > 0) {
                System.out.println("Нужно положить "+i+"-й предмет");
            }
        }
    }
 }
