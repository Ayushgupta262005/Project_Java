package com.expense_management_project;
import java.util.Date;

public class Expense {
    private String name;
    private double amount;
    private Date date;

    public Expense(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}