package Lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Создание Map
    public static Map<User, Integer> createUserMap() {
        return new HashMap<>();
    }

    // Добавление пользователя в рандомными очками
    public static void addUserWithRandomScore(Map<User, Integer> map, String name) {
        map.put(new User(name), (int)(Math.random() * 100));
    }

    // Метод считывает с консоли имя и показывает, сколько очков у такого пользователя
    public static void findUserAndShowScores(Map<User, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine().trim();
        for (var e: map.entrySet()) {
            if (e.getKey().getName().equals(name)) {
                System.out.printf("Результат " + e.getValue() + " очков");
                return;
            }
        }
        System.out.println("Пользователь не найден");
    }
}
