package java_session6;

import java.util.Scanner;

class check_prime extends Thread
{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int num,i,prime=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked for prime");
		num = sc.nextInt();
		
		for(i=1;i<num;i++)
		{
			if(num%i == 0)
			{
				prime++;   //to make a count if number is divisible except 1 
			}
			
			if(prime>1)   //if divisible by 1 and other number then not prime else prime
				break;
		}
		
		if(prime>1)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is  a prime number");		
		
		
		
	}
	
}

class check_prime_runnable implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
		int num,i,prime=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked for prime");
		num = sc.nextInt();
		
		for(i=1;i<num;i++)
		{
			if(num%i == 0)
			{
				prime++;   //to make a count if number is divisible except 1 
			}
			
			if(prime>1)   //if divisible by 1 and other number then not prime else prime
				break;
		}
		
		if(prime>1)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is  a prime number");		
		
		
		
	}
	
}



public class th_ass2 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		
		System.out.println("How you want to execute the program ");
		System.out.println("1.Thread Class 2.Runnable Interface ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				check_prime td = new check_prime();
				td.start();
			break;
				
			case 2:
				check_prime_runnable td1 = new check_prime_runnable();
				Thread th = new Thread(td1);
				th.start();
				
			break;
		}
		
		
		
		
	}

}
