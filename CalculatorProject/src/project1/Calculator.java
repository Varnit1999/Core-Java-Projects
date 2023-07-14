package project1;

import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int x=sc.nextInt();
		System.out.print("Enter the second number:");
		int y=sc.nextInt();
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("5 for terminating the program");
		
		int ch;
		do {
		
		System.out.print("Enter the case to be executed:");
		
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:System.out.println("Addition of the two numbers is:"+(x+y));
		break;
		case 2:System.out.println("Subtraction of the two numbers is:"+(x-y));
		break;
		case 3:System.out.println("Multiplication of the two numbers is:"+(x*y));
		break;
		case 4:System.out.println("Division of the two numbers is:"+(x/y));
		break;
		case 5:break;
		default:
			System.out.println("Invalid Choice");
		}
		}while(ch!=5);
		
		sc.close();

	}

}
