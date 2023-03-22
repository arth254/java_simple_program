package p2;
import java.util.Scanner;
public class P4 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Rectange \n2.Triange \n3.Cube \n4.Exit ");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			rectange();
			break;
		case 2 :
			triange();
			break;
		case 3 :
			cube();
			break;
		default :
			System.out.println("Please Enter right Choice");
			break;
		}
		sc.close();
	}
	public static void rectange() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of L");
		float l = sc.nextFloat();
		System.out.println("enter the value of B");
		float b = sc.nextFloat();
		System.out.println("enter the value of H");
		float h = sc.nextFloat();
		double re = l * b * h;
		System.out.println("Area of Rectange "+re);
		sc.close();
	}
	public static void triange() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of L");
		float l1 = sc.nextFloat();
		System.out.println("enter the value of B");
		float b1 = sc.nextFloat();
		double tr = l1 * b1;
		System.out.println("Area of Triange "+tr);
		sc.close();
		}
	public static void cube() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of L");
		float l2 = sc.nextFloat();
		double cu = l2 * l2 * l2;
		System.out.println("Area of Cube "+cu);
		sc.close();
	}
}
