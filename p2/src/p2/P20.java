package p2;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		int c,n,r,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		n = sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			ans=r*r*r+ans;
			n=n/10;
		}
		if(c==ans) {
			System.out.println("This number is armstrong number: "+ans);
		}
		else {
			System.out.println("This number is not armstrong number: "+ans);
		}
		sc.close();
	}

}
