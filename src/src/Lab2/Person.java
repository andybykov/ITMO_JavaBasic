package Lab2;
// Задание 2
// Конструктор класса Person - информация о человеке
public class Person {
    // поля класса
    String firstName;
    String lastName; // null без инициализации
    int age; // значение по умолчанию
    int phoneNo; // 0 без инициализации

    // Конструктор без параметров
    Person(){
        this.firstName = "NoName";
        this.age = 18;
    }
    // Конструктор с некторыми параметрами
    Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    // Конструктор во всеми параметрами
    Person(String firstName, String lastName, int age, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
    }
}