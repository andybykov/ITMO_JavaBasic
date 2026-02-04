package Lab6.Bank;
// Задание 1. абстрактный класс Человек
public abstract class Human {
    private String firstName;
    private String lastName;

    //  конструктор
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // методы с реализацией
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


    // абстрактный метод
    public abstract void printInfo();
}
