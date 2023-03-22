package p2;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your First number: ");
		int a = sc.nextShort();
		System.out.println("Enter Your Second number: ");
		int b = sc.nextShort();
		System.out.println("Enter Your Third number: ");
		int c = sc.nextShort();
		sc.close();
		if(a>b && a>c) {
			System.out.println("First number is Largest");
		}
		else if(b>c) {
			System.out.println("Second number is Largest");
		}else
		{
			System.out.println("Third number is Largest");
		}
	}

}
