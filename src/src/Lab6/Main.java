package Lab6;
import Lab6.Bank.BankEmployee;
import Lab6.Bank.Client;
import Lab6.Car.Car;
import Lab6.Car.Truck;
import Lab6.ParentChild.Child;
import Lab6.User.BasicUser;
import Lab6.User.ExtendedUser;

public class Main {
    public static void main(String[] args){
        // Задание 1,2
        Client client1 = new Client("Иван", "Иванов", "Самый-лучший-банк");
        Client client2 = new Client("Мария", "Иванова", "");
        BankEmployee employee = new BankEmployee("Алла", "Васильева", "Хороший-банк");

        client1.printInfo();
        System.out.println(client1.operation());

        System.out.println("Клиент: " + client2.getFullName() + ", Банк: " + client2.getBankName());

        employee.printInfo();
        System.out.println(employee.operation());

        // Задание 3.
        Car car = new Car(1500, "Honda civic", 'B', 190.0f);
        car.outPut();

        Truck truck = new Truck(5000, "MAN", 'R', 120.0f, 6, 15000);
        truck.outPut();
        truck.newWheels(8);

        Car unknownCar = new Car(); // параметры по умолчанию
        unknownCar.outPut();
        unknownCar.setColor('G');
        unknownCar.setModel("GAZ");
        unknownCar.setSpeed(100.0f);
        unknownCar.setWeight(3500);
        unknownCar.outPut();

        // Задание 4.
        Child child = new Child(112);
        child.printNumber();

        // Задание 5.
        ExtendedUser user = new ExtendedUser();
        user.enterUserAge();
        System.out.println("Полученный возраст: " + user.getUserAge());
        // переопределенный метод для получения имени
        user.enterUserName();
        System.out.println("Полное имя: " + user.getFullName());
    }
}