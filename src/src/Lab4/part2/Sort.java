package Lab4.part2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.arraycopy;

public class Sort {

    // Задание 1. Проверка отсторирован ли массив
    public static void chekSort(int[] array) {
        int arrLength = 0;
        // рассчет длины массива
        for (int a : array) {
            arrLength++;
        }
        boolean isSorted = true;
        if (arrLength > 0) {
            for (int i = 0; i < arrLength - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    isSorted = false; // не отсортирован
                    break;
                }
            }
            if (isSorted) {
                System.out.println("Ok");
            } else {
                System.out.println("Please try anagin");
            }
            //System.out.println("arr len: " + arrLength);
        }
    }

    // Задание 2. считывает с клавиатуры длину массива, заполняет и выводит
    public static void fillArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        final int ARRAY_LENGTH = scanner.nextInt();
        int[] array = new int[ARRAY_LENGTH];

        // заполняем
        System.out.println("Enter numbers of array: ");
        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            Scanner inArr = new Scanner(System.in);
            array[i] = inArr.nextInt();
        }
        // вывод
        System.out.print("Result: [");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(array[i]);

            // если не последний элемент
            if (i < ARRAY_LENGTH - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Задание 3. меняет местами первый и последний элемент массива
    public static void swapNumbers(int[] array) {
        int arrLength = 0;
        // рассчет длины массива
        System.out.print("Array 1: ");
        for (int a1 : array) {
            arrLength++;
            System.out.print(a1);
        }
        System.out.println();

        int begin = array[0];
        int end = array[arrLength - 1];

        array[arrLength - 1] = begin;
        array[0] = end;

        System.out.print("Array 2: ");
        for (int a2 : array) {
            System.out.print(a2);
        }
    }

    // Задание 4. Найдите первое уникальное в этом массиве число
    public static void findUniqueNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {

                if ((array[i] == array[j]) && (i != j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(array[i]);
                break;
            }
        }


    }

    // Задание 5. Заполнение массива случайными числами. Сотируем слиянием
    public static void megreSortArray(int[] array) {
        // Базовый случай, если массив пуст или имеес 1 элемент == уже отсортирован
        if (array == null || array.length <= 1) {
            return;
        }
        int mid = array.length / 2; // находим середину массива

        int[] leftArr = new int[mid]; // левый массив
        int[] rightArr = new int[array.length - mid]; // правый массив

        arraycopy(array, 0, leftArr, 0, mid); // копируем из array в левый массив
        arraycopy(array, mid, rightArr, 0, array.length - mid); // копируем из array в правый массив
        // рекурсивынй вызов для каждой половины
        megreSortArray(leftArr);
        megreSortArray(rightArr);

        megreArrays(array, leftArr, rightArr); // слияние после завершения рекурсии
    }

    // метод слияния массивов
    private static void megreArrays(int[] array, int[] leftArr, int[] rightArr) {
        int idxLeftArr = 0; // идекс левого массива
        int idxRightArr = 0; // индекс правого массива
        int idxArr = 0; // индекс резульата

        while (idxLeftArr < leftArr.length && idxRightArr < rightArr.length) {
            if (leftArr[idxLeftArr] <= rightArr[idxRightArr])
                array[idxArr++] = leftArr[idxLeftArr++];
            else
                array[idxArr++] = rightArr[idxRightArr++];
        }

        while (idxLeftArr < leftArr.length)
            array[idxArr++] = leftArr[idxLeftArr++];

        while (idxRightArr < rightArr.length)
            array[idxArr++] = rightArr[idxRightArr++];
    }

    // заполнение случайными числами
    public static void fillArrayRandom(int[] array, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // псевдослучайное число
            array[i] = random.nextInt(max) + 1;
        }
    }

    // вывода массива
    public static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
