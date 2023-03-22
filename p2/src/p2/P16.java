package p2;
import java.util.Scanner;
public class P16 {
	 public static void main(String[] args)
	    {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Howmany number you want");
		 int r = sc.nextInt();
		 int num[]= new int[r];
  		 for(int j=0;j<r;j++) {
			System.out.println("enter your number: ");
			num[j] = sc.nextInt();
  		 	}
	        sc.close();
			
	        int max = num[0];
	        int min = num[0];
	        for (int i = 1; i < num.length; i++) {
	            if (num[i] > max) {
	                max = num[i];
	            }
	            else if (num[i] < min) {
	                min = num[i];
	            }
	        }
	        System.out.println("This number is enter");
	 for(int k=0;k<r;k++) {
		 System.out.print(num[k]+",");
	 }
	        System.out.println("\nThe minimum number is " + min);
	        System.out.println("The maximum number is " + max);
	    } 
	    }


