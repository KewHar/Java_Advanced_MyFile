package clothes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(0);
        Scanner scanner = new Scanner(System.in);
        int choice;
        int amount;

        do {
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of money to add: ");
                    amount = scanner.nextInt();
                    pocket.setMoney(amount);
                    break;
                case 2:
                    System.out.print("Enter the amount of money to withdraw: ");
                    amount = scanner.nextInt();
                    int money = pocket.getMoney();
                    if (money < amount) {
                        System.out.println("Not enough money.");
                    } else {
                        pocket.setMoney(money - amount);
                        System.out.println("Withdrawn " + amount + " from the pocket.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();

    }
}
