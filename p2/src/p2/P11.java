package p2;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the days: ");
		int d = sc.nextShort();
		sc.close();
		int y=d/365;  
        int m=d/30;                                
        d=d%365;        
        d=d%30;
        System.out.println("Year: "+y);
        System.out.println("Month: "+m);
        System.out.println("remaining Days: "+d);

	}

}
