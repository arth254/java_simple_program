package p2;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the kilometre.");
		float km = sc.nextFloat();
		sc.close();
		float m = km*1000;
		System.out.println("Kilometre to Meter: "+ m );
		float cm = m*100;
		System.out.println("Kilometre to Foot: "+ cm );
		double i = km * 39370.1;
		System.out.println("Kilometre to Meter: "+i);
		double f = km * 3280.84;
		System.out.println("Kilometre to Meter: "+ f);
		
	}
}
