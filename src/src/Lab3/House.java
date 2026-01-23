package Lab3;
// Задание 3
public class House {
    private int floors;
    private int year;
    private String name;

    public void setAll(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void printAll() {
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + year);
        System.out.println("Наименование: " + name);
    }
    public int getYearsOfBuild(int currentYear) {
        return currentYear - year;
    }
}
