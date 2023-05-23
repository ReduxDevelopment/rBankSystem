package reduxdevelopment.BankSystem;

import java.util.Scanner;

/**
 * BANK MAIN MENU
 * @author vojtechbracho
 * @date 19.05.2023
 * @version 1.1.1
 */
public class Menu {
    LoginMenu LM = new LoginMenu();
    Scanner key = new Scanner(System.in);
    public boolean stop = true;

    public void getMenu(){
        boolean stop = true;
        System.out.println("        🏧 BANK SYSTEM v1.1.1 🏧");
        System.out.println("1️⃣ | Log In\n2️⃣ | Exit");
        while (stop){
            switch (key.nextLine()){
                case "1":
                case "log in":
                    LM.getMenu();
                    break;

                case "2":
                case "exit":
                    System.out.println("\n\n\n\n    [❗] Closing application...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.exit(0);
                    break;
            }
        }
    }
}
