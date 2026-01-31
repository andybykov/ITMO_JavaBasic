package Lab4; // Часть 1

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.arraycopy;

public class PrintAndSortArrays {
    // ЧАСТЬ 1
    // Задание 1. выводит на консоль нечетные числа от 1 до 99.
    public static void printOddNumbers(int min, int max) {
        for (int i = min; i <= max; ++i) {
            System.out.println(i);
        }
    }

    // Задание 2. выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5)
    public static void printDivisionCheck(int min, int max) {
        for (int i = min; i <= max; ++i) {
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

    // Задание 3. вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static boolean chekSumOfThree(int[] array) {
        if (array == null || array.length != 3) {
            return false;
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];

        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    // Задание 4. принимает три целых числа и возвращает true, если второе число больше первого числа,
    // а третье число больше второго числа
    public static boolean chekLargesNumber(int[] array) {
        if (array == null || array.length != 3) {
            return false;
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];

        return (a < b) && (c > b);
    }

    // Задание 5. есть ли число 3 как первый или последний элемент массива целых чисел
    public static boolean threeFirstOrLast(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return ((array[0] == 3) || (array[array.length - 1] == 3));
    }

    // Задание 6. проверка, что массив содержит число 1 или 3
    public static boolean oneOrThreeContains(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        // проверка условий
        for (int j : array) {

            if ((j == 1) || (j == 3)) {
                return true; // если нашли хотябы одно выходим
            }
        }
        return false;
    }

    // ЧАСТЬ 2
    // Задание 1. Проверка отсторирован ли массив
    public static boolean chekSort(int[] array) {
        if (array == null) {
            return false;
        }
        if (array.length == 1) return true; // один элемент

        if (array.length > 0) {
            for (int i = 0; i < array.length - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    return false; // не отсортирован
                }
            }

        }
        return true;
    }

    // Задание 2. считывает с клавиатуры длину массива, заполняет и выводит
//    public static void fillArrayUI() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter array length: ");
//        final int ARRAY_LENGTH = scanner.nextInt();
//        int[] array = new int[ARRAY_LENGTH];
//
//        // заполняем
//        System.out.println("Enter numbers of array: ");
//        for (int i = 0; i < ARRAY_LENGTH; ++i) {
//            Scanner inArr = new Scanner(System.in);
//            array[i] = inArr.nextInt();
//        }
//        // вывод
//        System.out.print("Result: [");
//        for (int i = 0; i < ARRAY_LENGTH; i++) {
//            System.out.print(array[i]);
//
//            // если не последний элемент
//            if (i < ARRAY_LENGTH - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }

    // Задание 3. меняет местами первый и последний элемент массива
    public static int[] swapFirstToLastNumbers(int[] array) {

        int begin = array[0];
        int end = array[array.length - 1];

        array[array.length - 1] = begin;
        array[0] = end;

        return array;
    }

    // Задание 4. Найдите первое уникальное в этом массиве число
    // возвращает пустой массив если не найдено или массив из одного числа (найденного)
    public static int[] findUniqueNumber(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0]; // пустой массив
        }

        // первое уникальное число
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;  // нашли совпадения
                }
            }

            if (isUnique) {
                // массив из ЭТОГО числа
                return new int[]{array[i]};
            }
        }

        return new int[0]; // нет уникальных
    }

        // Задание 5. Заполнение массива случайными числами. Сотируем слиянием
        public static void megreSortArray ( int[] array){
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
        private static void megreArrays ( int[] array, int[] leftArr, int[] rightArr){
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


        // заполняет массив из count элементов и возвращает его
        public static int[] fill ( int count){
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[count];
            System.out.println("Длина массива: " + count);
            for (int i = 0; i < count; i++) {
                System.out.printf("Введите %d значение: ", i + 1);
                numbers[i] = scanner.nextInt();
            }

            return numbers;
        }

        // вывод массива
        public static void print ( int[] array){
            if (array == null || (array.length == 0)) {
                System.out.println("[]");
            } else {
                System.out.print("Array: [");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);

                    // если не последний элемент
                    if (i < array.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }

        // преобразует в строку
        public static String arrayToString ( int[] array){
            if (array == null) {
                return "null";
            }

            if (array.length == 0) {
                return "[]";
            }

            StringBuilder sb = new StringBuilder("[");

            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i < array.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");

            return sb.toString();
        }

        // заполнение случайными числами
        public static void fillRandom ( int[] array, int max){
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                // псевдослучайное число
                array[i] = random.nextInt(max) + 1;
            }
        }
    }