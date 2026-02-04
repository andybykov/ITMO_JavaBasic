package Lab6.User;

import java.util.Scanner;

public class BasicUser {
    protected static Scanner scanner = new Scanner(System.in);
    private int userAge;

    // Конструкторы
    public BasicUser(int userAge) {
        this.userAge = setUserAge(userAge);
    }

    public BasicUser(){
        this.userAge = setUserAge(18);
    }

    // Метод который считывает и выводит возраст
    public void enterAndPrintUserInfo() {
        System.out.println("Введите возраст: ");
        this.userAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Возраст пользователя: " + this.userAge);
    }

    // Геттеры
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
}