/**
 *интерфейс банковского счета
 **/

public interface IBankAccount {

    /**
     * Положить конкретную сумму на счет в банке
     * @param depositBalance какая конкретная сумма внесена в банк
     */

    void deposit ( int depositBalance);

    /**
     * Снять конкретную сумму со счета
     * @param withdrawBalance какая конкретная сумма снята в банке
     */

    int withdraw ( int withdrawBalance );

    /**
     * Отобразить в консоли баланс счета
     */

    void getBalance();

}
