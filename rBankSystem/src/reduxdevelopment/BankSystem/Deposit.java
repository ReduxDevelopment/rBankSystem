package reduxdevelopment.BankSystem;

import java.util.Scanner;

import static reduxdevelopment.BankSystem.PreSet.bankmoney;
import static reduxdevelopment.BankSystem.PreSet.money;

/**
 * DEPOSIT SYSTEM
 * @author vojtechbracho
 * @date 19.05.2023
 * @version 1.1.1
 */

public class Deposit {
    Scanner key = new Scanner(System.in);

    //Addons
    public int selector;
    public int amount;
    private boolean stop = true;

    //setted deposit amounts
    public int deposit500 = 500;
    public int deposit1000 = 1000;
    public int deposit2000 = 2000;
    public void getDeposit(){
        boolean stop = true;
        while(stop){
            System.out.println("\n\n\n\n            💲 DEPOSIT 💲");
            System.out.println("Select how much do you want to deposit:");
            System.out.println("1️⃣ | 500$\n2️⃣ | 1 000$\n3️⃣ | 2 000$\n4️⃣ | Own value\n5️⃣ | Back");
            selector = key.nextInt();
            switch (selector){
                case 1:
                    System.out.println("(💳) Inserting card and setting value...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (deposit500<=money){
                        bankmoney = bankmoney + deposit500;
                        money = money - deposit500;
                        System.out.println("(💳) Succesfully deposited 💵 " + deposit500 + "$ from your pocket!");
                        System.out.println("(💳) You now have 💳 " + bankmoney + "$ in your bank!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    } else {
                        System.out.println("    (❗) Insufficient funds!");
                    }
                    stop = false;
                    break;

                case 2:
                    System.out.println("(💳) Inserting card and setting value...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (deposit1000<=money){
                        money = money - deposit1000;
                        bankmoney = bankmoney + deposit1000;
                        System.out.println("(💳) Succesfully deposited 💵 " + deposit1000 + "$ from your pocket!");
                        System.out.println("(💳) You now have 💳 " + bankmoney + "$ in your bank!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    } else {
                        System.out.println("    (❗) Insufficient funds!");
                    }
                    break;
                case 3:
                    System.out.println("(💳) Inserting card and setting value...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (deposit2000<=money){
                        money = money - deposit2000;
                        money = bankmoney + deposit2000;
                        System.out.println("(💳) Succesfully deposited 💵 " + deposit2000 + "$ from your pocket!");
                        System.out.println("(💳) You now have 💳 " + bankmoney + "$ in your bank!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    } else {
                        System.out.println("    (❗) Insufficient funds!");
                    }
                    break;
                case 4:
                    System.out.println("(💳) Inserting card...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("\nSelect your value: ");
                    int enterAmount = key.nextInt();
                    if (enterAmount<= money){
                        bankmoney = bankmoney + enterAmount;
                        money = money - enterAmount;
                        System.out.println("(💳) Succesfully deposited 💵 " + enterAmount + "$ from your pocket!");
                        System.out.println("(💳) You now have 💳 " + bankmoney + "$ in your bank!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } break;
                    } else {
                        System.out.println("    (❗) Insufficient funds!");
                    }
                    break;
                case 5:
                    System.out.println("\nSelect your next action:");
                    System.out.println("1️⃣ | Check balance\n2️⃣ | Deposit\n3️⃣ | Withdraw\n4️⃣ | Log off");
                    stop = false;
                    break;
                default:
                    System.out.println("    (❗) Incorrectly entered value!");
            }
        }
    }
}
