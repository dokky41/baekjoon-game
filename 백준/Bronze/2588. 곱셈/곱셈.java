import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int A1 = sc.nextInt();
		
		
		String A2 = sc.next();
		
		
		System.out.println(A1*(A2.charAt(2)- '0'));
		System.out.println(A1*(A2.charAt(1)- '0'));
		System.out.println(A1*(A2.charAt(0)- '0'));
		System.out.println(A1* Integer.parseInt(A2));
		
	}
}
