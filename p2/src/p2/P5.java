package p2;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of redius");
		float r = sc.nextFloat();
		float pi = 3.14f;
		float area =4 * pi * r * r;
		float volume = (4/3) * pi * r * r;
		System.out.printf("Area of sphere"+area);
		System.out.printf("\nVoluem of sphere "+volume);
		sc.close();
	}

}
