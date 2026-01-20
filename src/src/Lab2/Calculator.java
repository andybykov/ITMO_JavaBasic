package Lab2;
// Задание 1 - калькулятор с перегруженными типами данных
public class Calculator {

    // сложение
    public int sum(int a, int b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // вычитаение
    public int subtract(int a, int b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // умножение
    public int multiply(int a, int b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // деление
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero error");
            return 0;
        }
        return a / b;
    }

    public long divide(long a, long b) {
        if (b == 0) {
            System.out.println("Division by zero error");
            return 0;
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero error");
            return 0;
        }
        return a / b;
    }
}
