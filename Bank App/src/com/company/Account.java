package com.company;

import java.util.Random;

public class Account {
    public int pin;
    public int account_id;
    public int balance;

    public Account(int pin, int account_id){
        this.pin =pin;
        this.account_id =account_id ;
        this.balance = 0;
        System.out.println("Your account has been created. PIN:2317");

    }

    public void  showAccount(){
        System.out.println("PIN: " + this.pin + " Account_ID: " + this.account_id);
    }



    public void deposit(int amount){
        this.balance +=amount;
        System.out.println("Deposit successful");

    }

    public void withdraw(int amount){
        if (amount <= this.balance){
            this.balance -=amount;
            System.out.println("Successful withdraw");
        }
        else{
            System.out.println("Not enough balance");
        }
    }

    public void showBalance(){
        System.out.println("Current Balance: " + balance + "$");
    }


}
