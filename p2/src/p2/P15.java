	package p2;
	
	import java.util.Scanner;
	
	public class P15 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your character:-");
			char ch = sc.next().charAt(0);
			sc.close();
			if(ch>=65 && ch<=90) 
		    {
				System.out.println("CAPITAL");
		    }
		    else if(ch>=97 && ch<=122)
		    {
		    	System.out.println("SMALL");
		    }
		    else if(ch>=48 && ch<=57)
		    {
		    	System.out.println("DIGIT");
		    }
		    else{
		    	System.out.println("SPECIAL SYMBOL");
		    }
		}
	
	}
