import java.util.Scanner;
class Real2 
{
	static boolean f=true;
	static String name;
	static int age;
	static String gender;
	static int pwd;
	static int salary;
	static String address;
	static long phno;
	static String profileLevel="Normal account";
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
	while (f)
	{
		System.out.println("1.signup");
		System.out.println("2.login");
		System.out.println("3.exit");
		System.out.println(".....................");
		int a=s.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("enter your name");
				name=s.next();
				System.out.println("enter your age");
				age=s.nextInt();
				System.out.println("enter your gender");
				gender=s.next();
				System.out.println("enter your password");
				pwd=s.nextInt();
				if (age>=21)
				{
					System.out.println("Account Created successfully");
				}
				else
				{
					System.out.println("Grow up child");
					System.out.println(".....................");
				}
			}break;
			case 2:
			{
				System.out.println("enter name");
				String name1=s.next();
				System.out.println("enter pwd");
				int pwd1=s.nextInt();
				{
					if (name.equals(name1) && pwd==pwd1)
					{
						Login.rocky();
					}
					else
					{
						System.out.println("Invalid name and password");
					}
				}
			}break;
			case 3:
			{
				f=false;
				System.out.println("your account has logged out successfully");
			}
		}
	}
	}
}
class Login
{
	static boolean b=true;
	static void rocky()
	{
		while (b)
		{
		System.out.println("1.view profile");
		System.out.println("2.update profile");
		System.out.println("3.change password");
		System.out.println("4.exit");
		System.out.println(".....................");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		switch(x)
		{
			case 1:
			{
				System.out.println("Name is "+Real2.name);
				System.out.println("age is "+Real2.age);
				System.out.println("gender is "+Real2.gender);
				System.out.println("address is "+Real2.address);
				System.out.println("phone number is "+Real2.phno);
				System.out.println("salary is "+Real2.salary);
				System.out.println("the profile level is "+Real2.profileLevel);
				System.out.println(".....................");
			}break;
			case 2:
			{
				System.out.println("enter salary");
				Real2.salary=s.nextInt();
				System.out.println("enter address");
				Real2.address=s.next();
				System.out.println("enter phone number");
				Real2.phno=s.nextLong();
				if (Real2.salary>=50000)
				{
					Real2.profileLevel="Prime Account";
				}
			}break;
			case 3:
			{
				System.out.println("enter new password");
				int pwd1=s.nextInt();
				Real2.pwd=pwd1;
				System.out.println("Password has changed");
			}break;
			case 4:
			{
				b=false;
				System.out.println("logged out of your account");
			}break;
		}
		}
	}
}