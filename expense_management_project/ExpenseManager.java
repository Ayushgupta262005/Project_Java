package com.expense_management_project;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String name, double amount, Date date) {
        expenses.add(new Expense(name, amount, date));
        System.out.println("Expense added: " + name);
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        System.out.println("Expenses:");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println(i + ": " + expenses.get(i));
        }
    }

    public void deleteExpense(int index) {
        if (index < 0 || index >= expenses.size()) {
            System.out.println("Invalid index.");
            return;
        }
        Expense removed = expenses.remove(index);
        System.out.println("Removed expense: " + removed);
    }

    public void updateExpense(int index, String name, double amount) {
        if (index < 0 || index >= expenses.size()) {
            System.out.println("Invalid index.");
            return;
        }
        Expense expense = expenses.get(index);
        expenses.set(index, new Expense(name, amount, expense.getDate()));
        System.out.println("Updated expense at index " + index + ": " + name);
    }
}