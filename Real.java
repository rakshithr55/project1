import java.util.Scanner;
class Real 
{
	static boolean f=true;
	static String name;
	static int pwd;
	static long phno;
	static String email;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
	while (f)
	{
		System.out.println("1.signup");
		System.out.println("2.login");
		System.out.println("3.exit");
		int a=s.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("enter name");
				name=s.next();
				System.out.println("enter pwd");
				pwd=s.nextInt();
				System.out.println("enter phno");
				phno=s.nextLong();
				System.out.println("enter email");
				email=s.next();
				System.out.println("signed up successfully");
			}break;
			case 2:
		    {
				System.out.println("enter email");
				String email1=s.next();
				System.out.println("enter pwd");
				int pwd1=s.nextInt();
				if (email.equals(email1) && pwd==pwd1)
				{
					Login.transaction();
				}
				else
				{
					System.out.println("Invalid user or password");
				}
			}break;
			case 3:
			{
				f=false;
				System.out.println("Logged out of your account");
			}break;
		}
		}
	}
}
class Login
{
	static void transaction()
	{
		Scanner s=new Scanner(System.in);
		boolean f=true;
		int Balance=5000;
		while (f)
		{
		System.out.println("1.Check balanace");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Change pwd");
		System.out.println("5.logout");
		
		int a=s.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("Enter the Password");
				int pwd2=s.nextInt();
				if(Real.pwd==pwd2)
				{
					System.out.println(Balance);
				}
				else
				{
					System.out.println("Incorrect password");
				}
			}break;
			case 2:
			{
				System.out.println("Enter the Password");
				int pwd2=s.nextInt();
				if(Real.pwd==pwd2)
				{
					System.out.println("enter the amount to deposit");
					int amount=s.nextInt();
					Balance=Balance+amount;
					
					System.out.println("The updated amount is : "+Balance);
				}
				else
				{
					System.out.println("Incorrect password");
				}
			}break;
			case 3:
			{
				System.out.println("Enter the Password");
				int pwd2=s.nextInt();
				if(Real.pwd==pwd2)
				{
					System.out.println("enter the amount to withdraw");
									//System.out.println(Balance);
					int amount=s.nextInt();
					Balance=Balance-amount;
					System.out.println("The updated amount is : "+Balance);
				}
				else
				{
					System.out.println("Incorrect password");
				}
			}break;
			case 4:
			{
				System.out.println("Enter the Password");
				int pwd2=s.nextInt();
				if(Real.pwd==pwd2)
				{
					System.out.println("enter new password");
					int pwd3=s.nextInt();
					Real.pwd=pwd3;
					System.out.println("password has updated");
				}
				else
				{
					System.out.println("Incorrect password");
				}
			}break;
			case 5:
			{
				f=false;
				System.out.println("your account has logged out");
			}break;
		}
	}
	}
}