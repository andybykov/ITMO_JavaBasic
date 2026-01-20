package Lab3;

class JavaProgram {
    public static void main(String[] args) {
        // Задание 1
        Study studyJava = new Study("Изучение Java - это просто!");
        System.out.println(studyJava.printCourse());

        // Задание 2
        Car vaz = new Car("вишневый");
        vaz.printAll();

        Car verdover = new Car("ведровер", "серый", 1850.1);
        verdover.printAll();


    }
}
