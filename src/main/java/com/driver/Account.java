package com.driver;

public class Account {
	private String accountName;
//    /andlkasd/
    //something
    //dasdas
    public int balance = 1000;
//    https://github.com/acciojob/whatsapp-money-transfer-saymedgm.git
    // changes
    public Account(String name) {
        this.accountName = name;
    }

    public void sendMoney(Account receiver, int amount) {
    	// your code goes here
    }

    public void receiveMoney(int amount) {
        synchronized (this) {
        	// your code goes here
        }
    }
}
