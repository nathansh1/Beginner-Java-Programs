/*7/20/2022
*OOP pt 2
*/

import java.util.Scanner;
import java.io.*;

public class AtTheBank{
	public static void main(String args[]){
	
	Scanner scr = new Scanner(System.in);
	
	BankAccount myAccount = new BankAccount(1000.0, "Sally Jones");
	
	myAccount.deposit(505.22);
	
	System.out.println(myAccount.balance);
	
	myAccount.withdraw(100.0);
	
	
	System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
	
	
	}
}

class BankAccount{
	
	double balance;
	String name;
	
	public BankAccount(double balance, String name){
	
		this.balance = balance;
		this.name = name;
	
	}
	
	public void deposit(double depositNum){
	
		balance+=depositNum;
	
	}
	
	public void withdraw(double withdrawNum){
	
		balance-=withdrawNum;
	
	}
}