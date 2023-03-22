package p2;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of Fahrenheit: ");
		int f = sc.nextShort();
		sc.close();
		double c = (f-32)/1.8;
		System.out.println("Value of Centigrade: "+c);

	}

}
