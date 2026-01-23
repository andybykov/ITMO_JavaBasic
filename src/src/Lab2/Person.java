package Lab2;
// Задание 2
// Конструктор класса Person - информация о человеке
public class Person {
    // поля класса
    private String firstName;
    private String lastName; // null без инициализации
    private int age; // значение по умолчанию
    private int phoneNo; // 0 без инициализации

    // Конструктор без параметров
    public Person(){
        this.firstName = "NoName";
        this.age = 18;
    }
    // Конструктор с некторыми параметрами
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    // Конструктор во всеми параметрами
    public Person(String firstName, String lastName, int age, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    // полное имя
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть от 0 до 150!");
        }
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    // переопредение toString - строковеое представление объекта
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("firstName='").append(firstName).append("', ");
        sb.append("lastName='").append(lastName).append("', ");
        sb.append("age=").append(age).append(", ");
        sb.append("phoneNo=").append(phoneNo);
        return sb.toString();
    }
}