package com.example.bankapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class BankappApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a character: ");
		// int a = scanner.nextInt();
		// System.out.println(" value= " + a);
//		char c = scanner.next().charAt(0);
//		System.out.println(" value= " + c);
//		SpringApplication.run(BankappApplication.class, args);
		BankAccount bankAccount = new BankAccount("userName", "userId");
		bankAccount.showMenu();
	}
}

class BankAccount{
	private int balance;
	private int previousTransaction;
	private String customerName;
	private String customerId;

	public BankAccount(String cname, String cid){
		this.customerName = cname;
		this.customerId = cid;
	}

	public void deposit(int amount){
		if (amount != 0) {
			this.balance += amount;
			this.previousTransaction = amount;
		}
	}

	public void withDraw(int amount){
		if(amount != 0){
			this.balance -= amount;
			this.previousTransaction = -amount;
		}
	}

	public void getPreviousTransaction(){
		if(this.previousTransaction > 0){
			System.out.println("Deposited: " + this.previousTransaction);
		}else if(this.previousTransaction < 0){
			System.out.println("WithDrawed: " + this.previousTransaction);
		}else{
			System.out.println("No Transaction occured");
		}
	}

	public void showMenu(){
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome" + this.customerName);
		System.out.println("Your Id is: " + this.customerId);
		System.out.println("\n");
		System.out.println("Enter an option in below:");
		System.out.println("\n");
		System.out.println("A.Check Balancer");
		System.out.println("B.Deposit");
		System.out.println("C.WithDraw");
		System.out.println("D.Previous transaction");
		System.out.println("E. EXIT");

		do{
			System.out.println("Enter an option:");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option){
				case 'A':
					System.out.println("Balance = " + this.balance);
					break;
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int amount = scanner.nextInt();
					this.deposit(amount);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int amount2 = scanner.nextInt();
					this.withDraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					this.getPreviousTransaction();
					break;
				case 'E':
					System.out.println("Thank you for using our services!");
					break;
				default:
					System.out.println("Invalid Option! Please enter again!");
					break;
			}
		} while (Character.isAlphabetic(option));

		System.out.println("Thank you for using our services!");
	}
}
