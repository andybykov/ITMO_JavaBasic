package Lab3;

public class Car {
    private String name;
    private String color;
    private double weight;

    // конструтор без параметром
    Car() {
        this.color = "unknown";
        this.name = "no Name";
    }
    // конструтор только с цветом
    Car(String color) {
        this.color = color;
    }

    // конструтор с цветом и весом
    Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // конструтор со всеми параметрами
    Car(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    // Метод вывода всех значений полей
    public void printAll(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}
