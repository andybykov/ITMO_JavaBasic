package Lab6.Bank;

import Lab6.Bank.Human;

// Наследуемся от Person
public class BankEmployee extends Human implements Bankable {
    // Поле с тем же названием, что и у Client
    private String bankName;

    // Конструктор
    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    // реализация абстрактного метода
    @Override
    public void printInfo() {
        System.out.println("Сотрудник: " + getLastName() + " " + getFirstName());
        System.out.println("Работает в банке: " + bankName);
    }

    @Override
    public String getFullName(){
        return this.getFirstName() + " " +  this.getLastName();
    }

    // реализация интерфейса
    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String operation(){
         return "Сотрудник обслуживает клиента";
    }
}
