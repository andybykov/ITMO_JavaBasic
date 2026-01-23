package Lab3;

// Задание 4
public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    // конструктор без параметров
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // конструктор со всеми параметрами
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    // Вывод на консоль
    public void printAll() {
        System.out.println("Назвавние: " + this.name);
        System.out.println("Возраст: " + this.age);
        String str;
        if (this.isAlive) {
            str = "живое";
        } else {
            str = "не живое";
        }
        System.out.println("Статус: "+ str);
    }
}
