package code;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args)
	{
		// Step 1 : any number times table
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
		
		System.out.println("----------- End of step 1 ----------"); // divider
		
		
		// Step 2 : 'while' looping statement -> printing 6 times table
		
		int number6 = 6;
		int i = 1;
		while(i <= 9)
		{ 
			System.out.println(i + " x " + number6+ " = " + i*number6);
			i++;
		}
		
		// 'for' looping statement -> printing 7 times table
		
		int number7 = 7;
		for(i = 1; i <= 9; i++)
		{
			System.out.println(i + " x " + number7+ " = " + i*number7);
		}
		
		System.out.println("----------- End of step 2 ----------"); // divider
		
		
		// Step 3 : 'if' conditional statement -> printing any number times table
		
		System.out.print("What number for times table? : ");
		scan = new Scanner(System.in);
		int user_input = scan.nextInt();
		System.out.println("Your number : " + user_input);
		
		if(user_input < 2)
		{
			System.out.println("Error : Choose any number between 2 ~ 9");
		}
		else if (user_input > 9)
		{
			System.out.println("Error : Choose any number between 2 ~ 9");
		} else
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.println(j + " x " + user_input + " = " + j*user_input);
				i++;
			}
		}
		
		System.out.println("----------- End of step 3 ----------"); // divider
		
		
		// Step 4 : array -> printing 2 ~ 9 times table
		
		int[] result = new int[9];
		for(int k = 0; k < result.length - 1; k++)
		{
			result[k] = k + 2;
			
			for(int r = 1; r < 10; r++)
			{
				System.out.println(result[k] + " x " + r + " = " + result[k] * r);
			}
		}
		
		
	}
	
}
