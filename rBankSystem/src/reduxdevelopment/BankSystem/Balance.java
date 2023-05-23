package reduxdevelopment.BankSystem;

import static reduxdevelopment.BankSystem.PreSet.bankmoney;
import static reduxdevelopment.BankSystem.PreSet.money;

/**
 * BALANCE CHECKER
 * @author vojtechbracho
 * @date 19.05.2023
 * @version 1.1.1
 */

public class Balance {
    public void getBalance(){
        System.out.println("\n\n\n\n            💲 BALANCE 💲");
        System.out.println("    [💳] You have " + bankmoney + "$ in your Bank!");
        System.out.println("    [💵] You have " + money + "$ in your Wallet!");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
