package p2;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		int no,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		no = sc.nextInt();
		 while(no>0) {
			 r = no %10;
			 sum = sum +r;
			 no = no/10;
		 }
		 System.out.println("Sum of digit ="+sum);
		 sc.close();

	}

}
