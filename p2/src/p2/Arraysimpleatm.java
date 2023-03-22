package p2;

import java.util.Scanner;

public class Arraysimpleatm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your amout");
		 int r = sc.nextInt();
		 int n[]= {2000,500,200,100,50,20,10,5,2,1};
		 for(int i =0;i<n.length;i++) {
		 if(r>=n[i]) {
			 int a = r/n[i];
			 r = r % n[i];
			 System.out.println(n[i]+" * "+a+" = "+(a*n[i]));
		 } 
		 }
		 sc.close();


	}

}
