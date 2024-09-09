package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    private static ArrayList <Account> accounts ;
    private static int account_ID = 0;
    private static int pin;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        accounts = new ArrayList<>();



        System.out.println("Welcome");
        System.out.println("Press L to login");
        System.out.println("Press 1 to create a new account");

        String userInput = scanner.nextLine();

        switch (userInput){
            case("L"):
                if(userInput.equals("L")){
                    System.out.println("Give password");
                    int userPin = scanner.nextInt();
                    for (int i=0;i<accounts.size();i++){
                        if(userPin==accounts.get(i).pin){
                            System.out.println("You are logged in");

                        }
                    }

                }
                break;
            case("1"):
                System.out.println("Type a 4 digit PIN for your account");
                pin = scanner.nextInt();
                Account account = new Account(pin,account_ID);
                account_ID+=1;
                accounts.add(account);
                break;


        }






        System.out.println("Press 2 to deposit");
        System.out.println("Press 3 to withdraw");
        System.out.println("Press 4 to see your balance");
        System.out.println("Press 5 to see account info");
        System.out.println("Press 0 to exit");

         userInput = scanner.nextLine();

        do{


            switch (userInput){

                case("2"):
                    System.out.println("Enter the amount to deposit");
                    int dep_amount  = scanner.nextInt();
                    accounts.get(0).deposit(dep_amount);
                    break;

                case("3"):
                    System.out.println("Enter the amount you would  like to withdraw");
                    int with_amount  = scanner.nextInt();
                    accounts.get(0).withdraw(with_amount);
                    break;

                case ("4"):
                    accounts.get(0).showBalance();
                    break;

                case ("5"):
                    accounts.get(0).showAccount();
                    break;
            }

            System.out.println("Press for a New Transaction OR Exit.");
            userInput = scanner.nextLine();
        } while(!userInput.equals("0"));

    }
}
