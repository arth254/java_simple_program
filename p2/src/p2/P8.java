package p2;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your A number: ");
		int a = sc.nextShort();
		System.out.println("Enter Your B number: ");
		int b = sc.nextShort();
		sc.close();
		a =a+b;
		b=a-b;
		a=a-b;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}

}
