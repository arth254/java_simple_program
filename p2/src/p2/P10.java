package p2;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your A number: ");
		int a = sc.nextShort();
		System.out.println("Enter Your B number: ");
		int b = sc.nextShort();
		System.out.println("1.summation \n2.subtraction \n3.multiplication \n4.division ");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			add(a,b);
			break;
		case 2 :
			sub(a,b);
			break;
		case 3 :
			mul(a,b);
			break;
		case 4 :
			div(a,b);
			break;
		default :
			System.out.println("Please Enter right Choice");
			break;
		}
		sc.close();
		
	}
	public static void add(int a,int b){
		int add =a+b;
		System.out.println("Summation of two number is "+add);
	}
	public static void sub(int a,int b){
		int sub =a-b;
		System.out.println("Subtraction of two number is "+sub);
	}
	public static void mul(int a,int b){
		int mul =a*b;
		System.out.println("Multiplication of two number is "+mul);
	}
	public static void div(int a,int b){
		int div =a/b;
		System.out.println("Division of two number is "+div);
	}

}
