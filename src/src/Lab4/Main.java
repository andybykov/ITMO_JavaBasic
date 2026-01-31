package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         // Часть 1:
        // 1
        PrintAndSortArrays.printOddNumbers(0, 99);
        // 2
        PrintAndSortArrays.printDivisionCheck(1, 100);
        // 3
        int[] array1 = PrintAndSortArrays.fill(3); // создаем и заполняем массив
        System.out.println(PrintAndSortArrays.chekSumOfThree(array1));
        // 4
        int[] array2 = PrintAndSortArrays.fill(3); // создаем и заполняем массив         System.out.println(PrintAndSortArrays.chekLargesNumber(array2));
        // 5
        int[] array3 = new int[] { 3, -3, 7, 4, 5, 4, 3};
        PrintAndSortArrays.print(array3);
        System.out.println((PrintAndSortArrays.threeFirstOrLast(array3)));
        // 6
        int[] array4 = new int[10];
        PrintAndSortArrays.fillRandom(array4,10); // заполняем рандомно
        PrintAndSortArrays.print(array4);
        System.out.println(PrintAndSortArrays.oneOrThreeContains(array4));

        // Часть 2:
        // 1
        int[] array5 = new int [3];
        PrintAndSortArrays.fillRandom(array5, 10);
        String message = PrintAndSortArrays.chekSort(array5) ? "OK" : "Please try again";
        System.out.println(message);
        PrintAndSortArrays.print(array5);
        // 2
        System.out.print("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_LENGTH = scanner.nextInt();
        int [] array6 = PrintAndSortArrays.fill(ARRAY_LENGTH);
        PrintAndSortArrays.print(array6);
        // 3
        int[] array7 = new int [10];
        PrintAndSortArrays.fillRandom(array7,10); // заполняем рандомно
        System.out.println("Before swap: " + PrintAndSortArrays.arrayToString(array7));
        PrintAndSortArrays.swapFirstToLastNumbers(array7);
        System.out.println("After swap: " + PrintAndSortArrays.arrayToString(array7));
        // 4
        int[] array8 = new int[10];
        PrintAndSortArrays.fillRandom(array8,10); // заполняем рандомно
        int[] result = PrintAndSortArrays.findUniqueNumber(array8);
        if (result.length == 0) {
            System.out.println("Unique number if not found!");
        }
        else {
            System.out.println("Unique number: " + result[0]);
        }
        // 5
        int[] array9 = new int[50];
        PrintAndSortArrays.fillRandom(array9,100); // заполняем рандомно
        System.out.println("Array before sort: " + PrintAndSortArrays.arrayToString(array9));
        PrintAndSortArrays.megreSortArray(array9);
        System.out.println("Array after sort: " + PrintAndSortArrays.arrayToString(array9));












    }
}
