package p2;

import java.util.Scanner;

public class simpleatm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your amout");
		 int r = sc.nextInt();
		 if(r>=2000) {
			 int a = r/2000;
			 r = r % 2000;
			 System.out.println("2000 * "+a+" = "+(a*2000));
		 } 
			 if(r>=500) {
			 int a = r/500;
			 r = r % 500;
			 System.out.println("500 * "+a+" = "+(a*500));
		 }
			 if(r>=200) {
				 int a = r/200;
				 r = r % 200;
				 System.out.println("200 * "+a+" = "+(a*200));
			 }
			 if(r>=100) {
				 int a = r/100;
				 r = r % 100;
				 System.out.println("100 * "+a+" = "+(a*100));
			 }
			 if(r>=50) {
				 int a = r/50;
				 r = r % 50;
				 System.out.println("50 * "+a+" = "+(a*50));
			 }
			 if(r>=20) {
				 int a = r/20;
				 r = r % 20;
				 System.out.println("20 * "+a+" = "+(a*20));
			 }
			 if(r>=10){
				 int a = r/10;
				 r = r % 10;
				 System.out.println("10 * "+a+" = "+(a*10));
			 }
			 if(r>=5) {
				 int a = r/5;
				 r = r % 5;
				 System.out.println("5 * "+a+" = "+(a*5));
			 }
			 if(r>=2) {
				 int a = r/2;
				 r = r % 2;
				 System.out.println("2 * "+a+" = "+(a*2));
			 }
			 if(r>=1) {
				 int a = r/1;
				 r = r % 1;
				 System.out.println("1 * "+a+" = "+(a*1));
			 }
		 sc.close();
	}

}
