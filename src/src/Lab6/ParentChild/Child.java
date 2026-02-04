package Lab6.ParentChild;

// Класс-наследник
public class Child extends Parent {
    // метод вывода переменной из главного класса
    public void printNumber() {
        System.out.println("Число из Parent класса: " + getNumber());
    }

    // Конструкторы
    public Child(int number) {
        super(number);
    }

    public Child() {
        super();
    }
}
