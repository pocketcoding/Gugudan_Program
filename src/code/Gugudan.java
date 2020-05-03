package code;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args)
	{
		// any number times table
		System.out.print("What number for times table? : ");
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println(number + " * 1 = " + number * 1);
		System.out.println(number + " * 2 = " + number * 2);
		System.out.println(number + " * 3 = " + number * 3);
		System.out.println(number + " * 4 = " + number * 4);
		System.out.println(number + " * 5 = " + number * 5);
		System.out.println(number + " * 6 = " + number * 6);
		System.out.println(number + " * 7 = " + number * 7);
		System.out.println(number + " * 8 = " + number * 8);
		System.out.println(number + " * 9 = " + number * 9);
		
		System.out.println("---------------------");
		
		// 'while' looping statement -> making 6 times table
		
		int number6 = 6;
		int i = 1;
		while(i <= 9)
		{ 
			System.out.println(i + " x " + number6+ " = " + i*number6);
			i++;
		}
		
		System.out.println("---------------------");
		
		// 'for' looping statement -> making 7 times table
		
		int number7 = 7;
		for(i = 1; i <= 9; i++)
		{
			System.out.println(i + " x " + number7+ " = " + i*number7);
		}
		
		
	}
	
}
