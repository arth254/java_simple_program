package p2;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of redius");
		int r = sc.nextInt();
		sc.close();
		area(r);
	}
	
	public static void area(int r) {
		float pi = 3.14f;
		float area = pi * r * r;
		System.out.printf("The area of circle is "+area);
	}
}
