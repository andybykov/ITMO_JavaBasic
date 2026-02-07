package Lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1.
        List<String> fruits = Arrays.asList("ананас", "дыня", "арбуз", "апельсин", "ананас","банан");
        System.out.println(CollectionInstruments.removeDuplicates(fruits));
        // 2. добавляет 1000000 элементов в ArrayList и LinkedList.
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        CollectionInstruments.addRandomElementsToList(arrayList, 1000000);
        CollectionInstruments.addRandomElementsToList(linkedList, 1000000);
        // выбирает из заполненного списка элемент наугад 100000 раз, с выводом замера времени
        CollectionInstruments.getListsTest(arrayList, 100000); // Operating time = 0.006 sec
        CollectionInstruments.getListsTest(linkedList, 100000); // Operating time = 11.448 sec
        /*
         Разница во времени обусловлена методами хранения в памяти элементов
         ArrayList: прямой доступ по индексам, как в массиве
         LinkedList: для поиска элемента N, нужно пройти через все предыдущие N-1 элементов
         */

        // 3
        Map<User, Integer> map = User.createUserMap();
        User.addUserWithRandomScore(map, "Алекс");
        User.addUserWithRandomScore(map, "Дима");
        User.addUserWithRandomScore(map, "Тихон");

        User.findUserAndShowScores(map);
    }
}

