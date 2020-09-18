package com.epam.classes.aqa;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {

    public static void solveTask1() {
        //1.     Приветствовать любого пользователя при вводе его имени через командную строку.

        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }

    public static void solveTask2(String[] args) {
        //2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

        int stringLength = args.length;

        while (stringLength > 0) {
            System.out.print(args[stringLength-1]);
            stringLength--;
        }
    }

    public static void solveTask3(){
        //3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        System.out.println("Please enter number of random values:");
        Scanner scanner = new Scanner(System.in);
        int numberOfInt = scanner.nextInt();

        int[] arr = new int[numberOfInt];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void solveTask4(String[] args){
        //4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            sum = sum + value;
            multiply = multiply * value;
        }

        System.out.println("Sum:" + sum + ", " + "Product of multiply:" + multiply);
    }

    public static void solveTask5() {
        //5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Please enter number of month:");
        Scanner scanner = new Scanner(System.in);

        int numberOfMonth = 0;
        if (scanner.hasNextInt()) {
            numberOfMonth = scanner.nextInt();

            if (numberOfMonth < 0 || numberOfMonth > 12 || numberOfMonth == 0) {
                System.out.println("please enter number from 1 to 12");
                solveTask5();
            } else System.out.println(months[numberOfMonth - 1]);
        } else {
            System.out.println("not integer was entered");
            solveTask5();
        }
    }
}
