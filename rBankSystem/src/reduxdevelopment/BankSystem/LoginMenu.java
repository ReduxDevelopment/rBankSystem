package reduxdevelopment.BankSystem;

import java.util.Scanner;

/**
 * BANK LOGIN MENU
 * @author vojtechbracho
 * @date 19.05.2023
 * @version 1.1.1
 */

public class LoginMenu {
    //menus
    Balance balance = new Balance();
    Withdraw withdraw = new Withdraw();
    Deposit deposit = new Deposit();

    //addon
    Scanner key = new Scanner(System.in);
    public boolean stop = true;
    public void getMenu(){
        System.out.println("\n\n\n\n        🤗 WELCOME BACK!");
        System.out.println("Select your next action:");
        System.out.println("1️⃣ | Balance\n2️⃣ | Deposit\n3️⃣ | Withdraw\n4️⃣ | Back");
        boolean stop = true;
        while (stop){
            switch (key.nextLine()){
                case "1":
                case "balance":
                    balance.getBalance();
                    System.out.println("\n\n\n\nSelect your next action:");
                    System.out.println("1️⃣ | Balance\n2️⃣ | Deposit\n3️⃣ | Withdraw\n4️⃣ | Back");
                    break;

                case "3":
                case "withdraw":
                    withdraw.getWithdraw();
                    break;

                case "2":
                case "deposit":
                    deposit.getDeposit();
                    break;

                case "4":
                case "back":
                    System.out.println("\n\n\n\n        🏧 BANK SYSTEM v1.1.1 🏧");
                    System.out.println("1️⃣ | Log In\n2️⃣ | Exit");
                    stop = false;
                    break;

                default:
                    System.out.println("    [❗] Invalid value!");
            }
        }
    }
}
