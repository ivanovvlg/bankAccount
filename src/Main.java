public class Main {
    public static void main(String[] args) {

        // создаём объект bankAccount

        BankAccount bankAccount = new BankAccount(100000);

        // пополняем счёт на 10000 и проверяем счёт

        bankAccount.deposit(10000);
        bankAccount.getBalance();

        // снимаем со счёта 60000 и проверяем счёт

        bankAccount.withdraw(60000);
        bankAccount.getBalance();



        int page;
        int weight = 80;
        String phrase = "Hello";


    }
}