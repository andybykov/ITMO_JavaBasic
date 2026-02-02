package Lab6.ParentChild;

// Главный класс
public class Parent {
    private int number;

    public Parent(int number) {
        this.number = number;
    }

    public Parent() {
        this.number = 0; // по умолчанию
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