package Lab6.Car;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed +" км/ч.");
    }

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }
    // конструктор без параметров
    public Car() {
        weight = 0;
        model = "Unknown";
        color = '-';
        speed = 0;
    }

    // геттеры
    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public char getColor() {
        return color;
    }

    public float getSpeed() {
        return speed;
    }

    // сеттеры
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}
