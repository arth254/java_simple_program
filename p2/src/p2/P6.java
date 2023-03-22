package p2;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the priciple amount");
		int p = sc.nextInt();
		System.out.println("enter the rate");
		float r = sc.nextFloat();
		System.out.println("enter the year");
		int t = sc.nextInt();
		sc.close();
		double i = p*r*t;
		System.out.println("Interest :- "+i);
	}

}
