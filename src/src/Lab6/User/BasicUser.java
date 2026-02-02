package Lab6.User;

import java.util.Scanner;

public class BasicUser {
    protected static Scanner scanner = new Scanner(System.in);
    private String userName;
    private int userAge;

    // Конструкторы
    public BasicUser(String userName, int userAge) {
        this.userName = setUserName(userName);
        this.userAge = setUserAge(userAge);
    }

    public BasicUser(){
        this.userName = setUserName("");
        this.userAge = setUserAge(18);
    }

    // Геттеры
    public String getUserName() {
        return this.userName;
    }

    public int getUserAge() {
        return this.userAge;
    }

    // Сеттеры
    public int setUserAge(int userAge) {
        if (userAge < 18) {
            this.userAge = 18;
        } else {
            this.userAge = userAge;
        }
        return this.userAge;
    }

    public String setUserName(String userName) {
        if (userName.isEmpty()) {
            this.userName = "Безымянный";
        } else {
            this.userName = userName;
        }
        return this.userName;
    }

    // Метод для получения возраста пользователя
    public int enterUserAge() {
        System.out.print("Введите возраст: ");
        this.setUserAge(scanner.nextInt());
        scanner.nextLine();

        return this.userAge;
    }

    // Метод для получения имени пользователя
    public String enterUserName() {
        System.out.print("Введите имя: ");
        this.setUserName(scanner.nextLine());

        return this.userName;
    }
}