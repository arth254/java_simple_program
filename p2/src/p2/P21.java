package p2;

import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
	int a=0,b=1,c;
	int i=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any no:-");
	int n = sc.nextInt();
	System.out.print(a+","+b);
	while(i++ <n-1) {
		c = a+b;
		System.out.print(","+c);
		a=b;
		b=c;
	}
	sc.close();
	}

}
