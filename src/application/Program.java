package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {

		Account acc = new Account("Alex",1001, 0.0);
		BusinessAccount bacc = new BusinessAccount("Lucas", 1002, 0.0, 500.0);
		
		// UPCASTING - Casting da subClasse para superClasse //
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount("Adrie", 1003, 0.0, 200.0);
		Account acc3 = new SavingsAccount("Jones", 1004, 0.0, 300.0);
		
		// DOWNCASTING - Casting da superClasse para subClasse //
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.uptadeBalance();
			System.out.println("Uptade!");
		}
	}
}
