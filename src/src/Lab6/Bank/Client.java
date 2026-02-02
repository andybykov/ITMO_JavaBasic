package Lab6.Bank;


import Lab6.Bank.Human;

public class Client extends Human implements Bankable { // наследование от Human

    private String bankName;  // строковое поле - название банка

    // Конструктор
    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);

        if (bankName == null || bankName.isEmpty()) {
            this.bankName = Bankable.DEFAULT_BANK;
        } else {
            this.bankName = bankName;
        }
    }

    // реализация абстрактного метода и интерфейса из Human
    @Override
    public void printInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName());
        System.out.println("Банк: " + bankName);
    }

    // реализация интерфейса
    @Override
    public String getBankName() {
        return this.bankName;
    }

    @Override
    public String getFullName(){
        return this.getFirstName() + " " +  this.getLastName();
    }

    @Override
    public String operation(){
        return "Клиент производит каку-то банковскую операцию";
    }
}