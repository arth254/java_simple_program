package p2;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		int no=1,n,sum_odd=0,sum_even=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		n = sc.nextInt();
		while(no<=n*2) {
			if(no%2==0) {
				sum_even+=no;
			}else {
				sum_odd+=no;
			}
			no++;
		}
		System.out.println("Sum of First"+n+"Even number ="+sum_even);
		System.out.println("Sum of First"+n+"Odd number ="+sum_odd);
		sc.close();
	}

}
