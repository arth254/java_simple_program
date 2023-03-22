package p2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:-");
		String n1 = sc.nextLine();
		System.out.println("Enter Your Adress:-");
		String a1 = sc.nextLine();
		System.out.println("Enter Your City:-");
		String c1 = sc.nextLine();
		System.out.println("Enter Your Gender:-");
		String g1 = sc.nextLine();
		System.out.println("Enter Your Mobile number:-");
		int no = sc.nextShort();
		sc.close();
		address( n1,a1,c1,g1,no);

	}
	
	
	public static void address(String n1,String a1,String c1,String g1,int no) {
		System.out.print("Name : "+n1+"\nAdress : "+a1+"\nCity : "+c1+"\nGender : "+g1+"\nMobile number : "+no);
		
	}

}
