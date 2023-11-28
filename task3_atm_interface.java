package fsp;
import java.util.Random;
import java.util.Scanner;

interface AtmMachine
{
	void deposit(double amount);
	Boolean withdrawn(double amount);
	double getBalance();
}

class BankAccount implements AtmMachine
{
	private double balance;
	
	BankAccount(double InitialBalance)
	{
		balance = InitialBalance;
	}
	public double getBalance()
	{
		return balance;
	}
	public Boolean withdrawn(double amount)
	{
		if(amount<=balance)
		{
			balance = balance-amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void displayMenu()
	{
		System.out.println();
		System.out.println("MENU FOR ATM :");
		System.out.println("Press 1 for check balance : ");
		System.out.println("Press 2 for deposit money : ");
		System.out.println("Press 3 for withdraw money : ");
		System.out.println("Press 4 for exit : ");
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do 
		{
		   displayMenu();
		   System.out.println();
		   System.out.println("Enter your preference here :");
		   choice = sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   double balance = getBalance();
			   System.out.println("Your total  balance is : "+balance);
			   break;
		   case 2:
			   System.out.println("Enter the deposit amount : ");
			   double depositAmount = sc.nextDouble();
			   deposit(depositAmount);
			   System.out.println("Amount "+depositAmount+" is deposited ");
			   break;
		   case 3:
			   System.out.println("Enter the withdrawal Amount : ");
			   double withdrawAmount = sc.nextDouble();
			   if(withdrawn(withdrawAmount))
			     {
				   System.out.println("Withdraw "+withdrawAmount);
			     }
			   else {
				   System.out.println("Insufficient Balance !");
			   }
			   break;
		   case 4:
			   System.out.println("THANKS FOR USING THIS ATM");
			   break;
			   default :
				   System.out.println("Please try Again ! your input is invalid ");
			   }
			
		}while(choice !=4);
	}
	
}
class task3_atm_interface
{
	public static void main(String[] args)
	{
		BankAccount b = new BankAccount(0);
		
		b.run();
	}
}
