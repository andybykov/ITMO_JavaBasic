package Lab9;

import java.util.*;

public class CollectionInstruments {
    //Задание 1. метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        if (collection == null) {
            return new LinkedHashSet<>();
        }
        return new LinkedHashSet<>(collection);
    }

    // Задание 2. метод, который добавляет maxNum элементов в List
    public static List<Double> addRandomElementsToList(List<Double> list, int maxNum) {
        if (maxNum < 0) maxNum = 1;
        // заполнение списков
        for (int i = 0; i < maxNum; i++) {
            list.add(Math.random() * maxNum);
        }
        return list; // та же коллекция
    }

    // Метод, который выбирает из заполненного списка элемент наугад numbers раз, с выводом замера времени
    public static void getListsTest(List<Double> list, int numbers) {
        //final int numbres = 100000;
        if (list.isEmpty()) return;
        if (numbers < 0) numbers = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numbers; i++) {
            list.get((int) (Math.random() * (numbers - 1)));
        }
        System.out.print("Operating time = ");
        System.out.println((double) (System.currentTimeMillis() - startTime) / 1000 + " sec");
    }
}
