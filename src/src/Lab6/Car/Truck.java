package Lab6.Car;

public class Truck extends Car {
    // поля грузовика
    private int nWheels;
    private int maxWeight;

    // конструктор
    public Truck(int weight, String model, char color, float speed,
                 int nWheels, int maxWeight) {
        super(weight, model, color, speed); // родительский конструктор

        this.nWheels = nWheels;
        this.maxWeight = maxWeight;
    }

    // устанавливает новое значение в поле «количество колес» и выводит его в консоль
    public void newWheels(int newNwheels) {
        this.nWheels = newNwheels;
        System.out.println("Новое число колес: " + this.nWheels);
    }


    @Override
    public void outPut() {
        super.outPut(); // родительский метод
        // добавлям новую информацию
        System.out.println("Количество колес " + nWheels);
        System.out.println("Максимальный вес " + maxWeight + " кг");
    }

    // Геттеры
    public int getNumberOfWheels() {
        return nWheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    // Сеттеры
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setNumberOfWheels(int nWheels){
        this.nWheels = nWheels;
    }
}