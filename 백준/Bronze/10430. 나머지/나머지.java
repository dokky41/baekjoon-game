import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		
		if(2> A || A>10000){
			
		}else if(2> B || B>10000){
			
		}else if(2> C || C>10000){
			
		}else{
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C) * (B%C))%C);
		}
    }
    
}