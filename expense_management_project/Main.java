package com.expense_management_project;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Expense Tracking System!");
        
        do {
            System.out.println("\nAvailable commands: add, view, delete, update, exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter expense name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    manager.addExpense(name, amount, new Date());
                    break;

                case "view":
                    manager.viewExpenses();
                    break;

                case "delete":
                    System.out.print("Enter the index of the expense to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    manager.deleteExpense(deleteIndex);
                    break;

                case "update":
                    System.out.print("Enter the index of the expense to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new expense name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new expense amount: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    manager.updateExpense(updateIndex, newName, newAmount);
                    break;

                case "exit":
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}