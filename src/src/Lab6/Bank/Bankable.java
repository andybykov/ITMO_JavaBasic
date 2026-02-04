package Lab6.Bank;

interface Bankable {
    public static final String DEFAULT_BANK = "не указан"; // константа

    public String getBankName();

    public String getFullName();

    public String operation(); // по разному реализуется для классов
}
