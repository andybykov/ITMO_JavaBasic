package Lab4;

import Lab4.part1.PrintNumbers;
import Lab4.part2.Sort;

public class Main {
    public static void main(String[] args){
        // Часть 1:
        PrintNumbers.printOddNumbers();
        PrintNumbers.printDivisionCheck();
        System.out.println(PrintNumbers.printSum());
        System.out.println(PrintNumbers.printLargesNum());
        System.out.println(PrintNumbers.threeFirstOrLast());
        System.out.println(PrintNumbers.oneOrThreeContains());


        // Часть 2:
        Sort.chekSort(new int[] {1, 3, 2, 4});
        Sort.fillArray();
        Sort.swapNumbers(new int[] {1, 2, 3, 4});
        Sort.findUniqueNumber(new int[] {1, 2, 3, 1, 2, 4});

        // Создаем массив
        int[] array = new int[50];
        // Заполняем массив случайными числами до 100
        Sort.fillArrayRandom(array, 100);
        System.out.println("Исходный массив:");
        Sort.printArray(array);
        // Сортируем массив
        Sort.megreSortArray(array);
        System.out.println("Сортированный массив:");
        Sort.printArray(array);
    }
}
