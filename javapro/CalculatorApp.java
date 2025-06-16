package javapro;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		double num1=sc.nextDouble();
		System.out.println("Enter the Second Number:");
		double num2=sc.nextDouble();
		System.out.println("Choose an Operation(+,-,*,/):");
		char operators=sc.next().charAt(0);
		double result;
		switch(operators) {
		case '+':
			result=num1+num2;
			System.out.println("Result:"+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("Result:"+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("Result:"+result);
			break;
		case '/':
			if(num2!=0) {
				result=num1/num2;
				System.out.println("Result:"+result);
			}
			else {
				System.out.println("Error:Cannot divide by zero");
			}
			break;
		default:
			System.out.println("Invalid Operator: Enter again");
			
		}
		sc.close();
	
		
	}

}