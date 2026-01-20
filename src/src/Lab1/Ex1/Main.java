package Lab1.Ex1;

import java.util.Scanner;

public class Main {
    // Задание 1
    public static void exercise1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    // Задание 2
    public static void exercise2() {
        double result1 = (46.0 + 10.0) * (10.0 / 3.0);
        double result2 = (29.0 * 4.0) * (-15);
        System.out.println(result1);
        System.out.println(result2);
    }

    // Задание 3
    public static void exercise3() {
        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);
    }

    // Задание 4
    public static void exercise4() {
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }

    // Задание 5
    public static void exercise5() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        int b = in.nextInt();
        System.out.println(b);
        int c = in.nextInt();
        System.out.println(c);
    }

    // Задание 6
    public static void exercise6() {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();

        if (b % 2 == 0) {
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        } else {
            System.out.println("Нечетное");
        }
    }


    // Точка входа
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
    }
}
