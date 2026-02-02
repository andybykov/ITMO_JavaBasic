package Lab6.User;

public class ExtendedUser extends BasicUser{
    private String userName;

    // Конструкторы
    public ExtendedUser(int userAge, String userName) {
        super(userAge);
        this.userName = this.setUserName(userName);
    }

    public ExtendedUser(){
        super();
        this.userName = this.setUserName("");
    }

    // Геттер
    public String getUserName() {
        return this.userName;
    }

    // Сеттер
    public String setUserName(String name) {
        if (name.isEmpty()) {
            this.userName = "Безымянный";
        } else {
            this.userName = name;
        }

        return this.userName;
    }

    // Переопределенный метод для вывода имени пользователя
    @Override
    public void enterAndPrintUserInfo() {
        super.enterAndPrintUserInfo(); // надо ли вызывать??
        System.out.println("Введите имя: ");
        this.userName = scanner.nextLine();
        System.out.println("Имя пользователя: " + this.userName);
    }
}
