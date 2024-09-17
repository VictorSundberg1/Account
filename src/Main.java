import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(12000);
        Account a2 = new Account(100, "Victor");

        Scanner sc = new Scanner(System.in);


        boolean running = true;

        while (running) {
            printMenu();
            int menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Amount of withdraw: ");
                    a2.withdrawBalance(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Amount to deposit: ");
                    a2.depositBalance(sc.nextDouble());
                    break;
                case 3:
                    System.out.println(a2);
                    break;
                case 4:
                    System.out.println("Goodbye " + a2.getName());
                    running = false;
                    break;
            }
        }



    }

    public static void printMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Show balance");
        System.out.println("4. Exit");
    }
}