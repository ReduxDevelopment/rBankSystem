package reduxdevelopment.BankSystem;

import java.util.Scanner;

import static reduxdevelopment.BankSystem.PreSet.bankmoney;
import static reduxdevelopment.BankSystem.PreSet.money;

/**
 * WITHDRAW SYSTEM
 * @author vojtechbracho
 * @date 19.05.2023
 * @version 1.1.1
 */
public class Withdraw {
    Scanner key = new Scanner(System.in);

    //Addons
    private int selector;
    private int amount;
    private boolean stop = true;

    //setted withdrawal amounts
    private int withdraw500 = 500;
    private int withdraw1000 = 1000;
    private int withdraw2000 = 2000;
    public void getWithdraw(){
        boolean stop = true;
        while(stop){
            System.out.println("\n\n\n\n            💲 WITHDRAW 💲");
            System.out.println("Select how much do you want to withdraw:");
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
                    if (withdraw500<=bankmoney){
                        money = money + withdraw500;
                        bankmoney = bankmoney - withdraw500;
                        System.out.println("(💳) Succesfully withdrawed 💳 " + withdraw500 + "$ from your bank!");
                        System.out.println("(💳) You now have 💵 " + money + "$ in your pocket!");
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
                case 2:
                    System.out.println("(💳) Inserting card and setting value...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (withdraw1000<=bankmoney){
                        money = money + withdraw1000;
                        bankmoney = bankmoney - withdraw1000;
                        System.out.println("(💳) Succesfully withdrawed 💳 " + withdraw1000 + "$ from your bank!");
                        System.out.println("(💳) You now have 💵 " + money + "$ in your pocket!");
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
                    if (withdraw2000<=bankmoney){
                        money = money + withdraw2000;
                        bankmoney = bankmoney - withdraw2000;
                        System.out.println("(💳) Succesfully withdrawed 💳 " + withdraw2000 + "$ from your bank!");
                        System.out.println("(💳) You now have 💵 " + money + "$ in your pocket!");
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
                    if (enterAmount<= bankmoney){
                        bankmoney = bankmoney - enterAmount;
                        money = money + enterAmount;
                        System.out.println("(💳) Succesfully withdrawed 💳 " + enterAmount + "$ from your bank!");
                        System.out.println("(💳) You now have 💵 " + money + "$ in your pocket!");
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
