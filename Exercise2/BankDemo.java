/**
 * Name Surname : Furkan Bozkurt
 * Date: 16.11.2026
 */
package Exercise2;

public class BankDemo {
    public static void main(String[] args) {

        Bank bank = new Bank();

        //Customer arrivals
        bank.arrive("Ali");
        bank.arrive("Ayse");
        bank.arrive("Mehmet");
        bank.arrive("Zeynep");
        bank.arrive("Can");

        bank.displayStatus();

        //Teller 2 finishes
        bank.completeTransaction(2);
        bank.displayStatus();

        //Teller 1 finishes
        bank.completeTransaction(1);
        bank.displayStatus();
    }
}
