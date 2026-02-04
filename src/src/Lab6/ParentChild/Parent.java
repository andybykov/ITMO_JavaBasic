package Lab6.ParentChild;

import java.util.Scanner;

// Главный класс
public class Parent {
    private int number;
    protected static Scanner scanner = new Scanner(System.in);

    public Parent(int number) {
        this.number = number;
    }

    public Parent() {
        this.number = 0; // по умолчанию
    }

    // метод считывания с консоли
    public void enterNumber(){
        System.out.println("Введите число: ");
        this.number = scanner.nextInt();
    }

    // Геттер
    public int getNumber() {
        return number;
    }

    // Сеттер
    public void setNumber(int number) {
        this.number = number;
    }
}