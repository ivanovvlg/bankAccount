/**
 *класс банковского счета
 **/

public class BankAccount implements IBankAccount {

    /**
     * создаем поле с именем currentBalance для того чтобы хранить текущее значение баланса счета
     */
    private int balance;

    /**
     * создаем конструктор класса BankAccount
     *
     * @param balance это параметр значения счета
     */

    public BankAccount(int balance) { this.balance = balance;}


    /**
     * метод deposit, который позволяет увеличивать значение в поле balance на размер значения, которое было передано при вызове данного метода
     *
     * @param depositBalance параметр увеличения значения счета
     */


    @Override
    public void deposit (int depositBalance) {
        balance = balance + depositBalance;
            }

    /**
     * метод withdraw, который позволяет уменьшить значение в поле balance на размер значения, которое было передано при вызове данного метода
     *
     * @param withdrawBalance параметр снижения значения счета
     */

    @Override
    public int withdraw (int withdrawBalance) {
        balance = balance + withdrawBalance;
        return withdrawBalance;
            }

        /**
     * метод getBalance, который позволяет вывести выводить в консоль текущее значение поля balance
     */
    @Override
    public void getBalance() {
        System.out.println("Ваш баланс составляет"+ balance + "долларов");
    }
}

