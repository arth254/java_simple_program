package p2;

import java.util.Scanner;

public class P13 {

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
			System.out.println("Mixmum is number: "+a);
		}
		else if(b>c && b>a) {
			System.out.println("Mixmum is number: "+b);
		}else
		{
			System.out.println("Mixmum is number: "+c);
		}
		if(a<b && a<c) {
			System.out.println("Minimum is number: "+a);
		}
		else if(b<c && b<a) {
			System.out.println("Minimum is number: "+b);
		}else
		{
			System.out.println("Minimum is number: "+c);
		}
	}

}
