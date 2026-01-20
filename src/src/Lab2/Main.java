package Lab2;

public class Main {
    // Задание 1
    public static void printCalculatorTest() {
        Calculator calc = new Calculator();

        // разные типы данных
        int a = 342012;
        long b = 1586804784;
        double c = 4.551;
        int zero = 0;

        // тест методов
        System.out.println(calc.sum(a, a));
        System.out.println(calc.sum(b, b));
        System.out.println(calc.sum(c, c));

        // вычитание
        System.out.println(calc.subtract(a, a));
        System.out.println(calc.subtract(b, b));
        System.out.println(calc.subtract(c, c));

        // умножение
        System.out.println(calc.multiply(a, a));
        System.out.println(calc.multiply(b, b));
        System.out.println(calc.multiply(c, c));

        // деление
        System.out.println(calc.divide(a, a));
        System.out.println(calc.divide(b, b));
        System.out.println(calc.divide(c, c));

        // деление на ноль
        System.out.println(calc.divide(a, zero));
        System.out.println(calc.divide(b, zero));
        System.out.println(calc.divide(c, zero));
    }

    // Задание 3
    public static void printPersonTest(){
        // вызов конструктора без параметров
        Person andy = new Person();
        System.out.println(andy.firstName);
        System.out.println(andy.lastName);
        System.out.println(andy.age);
        System.out.println(andy.phoneNo);
        System.out.println("\n");

        // вызов конструктора с некторыми параметрами
        Person vasya = new Person("Василий", 35);
        System.out.println(vasya.firstName);
        System.out.println(vasya.lastName);
        System.out.println(vasya.age);
        System.out.println(vasya.phoneNo);
        System.out.println("\n");

        // вызов конструктора со всеми параметрами
        Person adam = new Person("Адам", "Адамович", 40, 1234567890);
        System.out.println(adam.firstName);
        System.out.println(adam.lastName);
        System.out.println(adam.age);
        System.out.println(adam.phoneNo);
        System.out.println("\n");
    }

    // Точка входа
    public static void main(String[] args) {
        // Тест калькулятора
        printCalculatorTest();
        // Тест конструкторов класса Person
        printPersonTest();
    }
}
