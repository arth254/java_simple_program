package p2;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your number: ");
		int a = sc.nextShort();
		sc.close();
		if(a<0) {
			System.out.println("Number is negative");
		}
		else if(a==0) {
			System.out.println("Number is zero");
		}else{
			System.out.println("Number is positive");
		}
	}
}
