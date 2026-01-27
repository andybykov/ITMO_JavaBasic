package Lab4;

import java.util.Scanner;

public class PrintNumbers {

    // выводит на консоль нечетные числа от 1 до 99.
    public static void printOddNumbers() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(i);
        }
    }

    // выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5)
    public static void printDivisionCheck() {
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    // вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static boolean printSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int inputA = in.nextInt();
        System.out.println("Введите второе число: ");
        int inputB = in.nextInt();
        System.out.println("Введите третье число: ");
        int inputC = in.nextInt();
        boolean isValidSum = (inputA + inputB) == inputC;
        //System.out.println("Результат: " + isValidSum);

        return isValidSum;
    }

    // принимает три целых числа и возвращает true, если второе число больше первого числа,
    // а третье число больше второго числа
    public static boolean printLargesNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int inputA = in.nextInt();
        System.out.println("Введите второе число: ");
        int inputB = in.nextInt();
        System.out.println("Введите третье число: ");
        int inputC = in.nextInt();

        return (inputA < inputB) && (inputC > inputB);
        //System.out.println("Результат: " + chek);

    }

    // есть ли 3 как первый или последний элемент массива целых чисел
    public static boolean threeFirstOrLast() {
        Scanner scanner = new Scanner(System.in);
        int arrLength = 0;
        while (true) {
            System.out.print("Введите длину массива: ");
            arrLength = scanner.nextInt();

            if (arrLength >= 2) {
                break;
            } else {
                System.out.println("Длина массива должна быть больше или равна 2!");
            }
        }
        int[] array = new int[arrLength];
        boolean chek = false;

        // заполняем
        System.out.println("Введите значения: ");
        for (int i = 0; i < arrLength; ++i) {
            Scanner inArr = new Scanner(System.in);
            array[i] = inArr.nextInt();
        }
        // проверка условий
        if ((array[0] == 3) || (array[arrLength - 1] == 3)) chek = true;

        System.out.print("array = ");
        // проходим по массиву
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        //System.out.println(chek);
        return chek;
    }

    // проверка, что массив содержит число 1 или 3
    public static boolean oneOrThreeContains() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arrLength = scanner.nextInt();
        boolean chek = false;

        if (arrLength <= 0) {
            System.out.println("Длина не может быть 0 и меньше!");
            return false;
        }
        int[] array = new int[arrLength];

        // заполняем
        System.out.println("Введите значения: ");
        for (int i = 0; i < arrLength; ++i) {
            Scanner inArr = new Scanner(System.in);
            array[i] = inArr.nextInt();
        }
        // проверка условий
        for (int i = 0; i < arrLength; ++i) {

            if ((array[i] == 1) || (array[i] == 3)) {
                chek = true;
                break; // если нашли хотябы одно выходим
            }
        }
        return chek;
    }
}