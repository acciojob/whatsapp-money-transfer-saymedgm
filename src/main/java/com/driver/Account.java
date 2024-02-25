package com.driver;

public class Account {
    private String accountName;
    public int balance = 1000;

    public Account(String name) {
        this.accountName = name;
    }

    public void sendMoney(Account receiver, int amount) {
        synchronized (this) {
            System.out.println(accountName + " is sending " + amount + " to " + receiver.accountName);
            balance -= amount;
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            receiver.receiveMoney(amount);
        }
    }

    public void receiveMoney(int amount) {
        synchronized (this) {
            System.out.println(accountName + " received " + amount);
            balance += amount;
        }
    }
}