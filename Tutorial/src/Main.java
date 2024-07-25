import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Bank of Java");
        Bank bank = new Bank();

        while(true) {
            System.out.print("Withdrawal, Deposit, Amount, Exit: ");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("withdrawal")) {
                System.out.print("Amount: ");
                bank.withdrawal(scan.nextInt());
            } else if (choice.equalsIgnoreCase("deposit")) {
                System.out.print("Amount: ");
                bank.deposit(scan.nextInt());
            } else if (choice.equalsIgnoreCase("amount")) {
                System.out.println(bank);
            } else if (choice.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println();
        }
    }
}
