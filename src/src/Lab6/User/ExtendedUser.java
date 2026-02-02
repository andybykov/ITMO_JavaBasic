package Lab6.User;

public class ExtendedUser extends BasicUser{
    private String userLastName;

    // Конструкторы
    public ExtendedUser(String userName, String userLastName, int userAge) {
        super(userName, userAge);
        this.userLastName = this.setUserLastName(userLastName);
    }

    public ExtendedUser(){
        super();
        this.userLastName = this.setUserLastName("");
    }


    // Геттер
    public String getUserLastName() {
        return userLastName;
    }

    public String getFullName() {
        return super.getUserName() + " " + getUserLastName();
    }

    // Сеттер
    public String setUserLastName(String lastName) {
        if (lastName.isEmpty()) {
            this.userLastName = "Бесфамильный";
        } else {
            this.userLastName = lastName;
        }

        return this.userLastName;
    }

    // Переопределенный метод для получения имени пользователя
    @Override
    public String enterUserName() {
       super.enterUserName();
        // + ввод фамилии
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        setUserLastName(lastName);

        // полное имя
        return getFullName();
    }
}
