package Lab3;

class JavaProgram {
    public static void main(String[] args) {
        // Задание 1
        Study studyJava = new Study("Изучение Java - это просто!");
        System.out.println(studyJava.printCourse());
        System.out.println("\n");

        // Задание 2
        Car vaz = new Car("вишневый");
        vaz.printAll();

        Car verdover = new Car("ведровер", "серый", 1850.1);
        verdover.printAll();
        System.out.println("\n");

        // Задание 3
        House house1 = new House();
        house1.setAll(15, 1990, "жилой дом");
        house1.printAll();
        System.out.println("\n");

        House house2 = new House();
        house2.setAll(1, 1999, "гараж");
        house2.printAll();
        System.out.println("\n");

        // Задание 4
        Tree palm = new Tree();
        System.out.println("\n");

        Tree pine = new Tree(175, "сосна");
        pine.printAll();
        System.out.println("\n");

        Tree aspen = new Tree(75, false, "осина");
        aspen.printAll();
        System.out.println("\n");
    }
}
