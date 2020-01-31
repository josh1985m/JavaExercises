import java.util.ArrayList;
import java.util.Date;

public class BankApplication {
	public static class Account
	{
		private int id = 0;
		protected double balance = 0;
		private double annualInterestRate = 4.5;
		private Date dateCreated;
		
		public Account()
		{
			
		}
		public Account(int id, double balance, double annualInterestRate)
		{
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			this.dateCreated = new Date();
		}
		public void getMonthlyInterestRate()
		{
			double monthlyInterest = balance * ((annualInterestRate/12)/100);
			System.out.println(monthlyInterest);
		}
		public double withdraw(double amount)
		{
			double withdraw = amount;
			balance = balance - withdraw;
			return balance;
		}
		public double deposit(double amount)
		{
			double deposit = amount;
			balance = balance + deposit;
			return balance;
		}
	}
	
	public static class SavingsAccount extends Account
	{
		double interest = 1.9;
		public double addInterest(double balance)
		{
			balance = balance + (balance * interest);
			return balance;
		}
	}
	
	public static class CurrentAccount extends Account
	{
		double overdraft = -600;
		public double withdraw(double amount)
		{
			double withdraw = amount;
			double possibleBalance = balance - withdraw;
			if (possibleBalance > overdraft)
			{
				balance = possibleBalance;
				return balance;
			}
			else 
			{
				System.out.println("Sorry, you don't have enough in your account to make this withdrawl.");
				return balance;
			}
		}
		public static class Bank
		{
			ArrayList<Object> accountList [];
			public Bank(Object account)
			{
				this.accountList.equals(account);
			}
		}
	}

	public static void main(String[] args) {
		Account myacct = new Account();
		myacct.deposit(1000);
		myacct.withdraw(400);
		System.out.println(myacct.balance);
		myacct.getMonthlyInterestRate();
		myacct.withdraw(1400);
		System.out.println(myacct.balance);
		CurrentAccount curracc = new CurrentAccount();
		curracc.deposit(10000);
		curracc.withdraw(2000000);
		System.out.println(curracc.balance);
		
	}

}
