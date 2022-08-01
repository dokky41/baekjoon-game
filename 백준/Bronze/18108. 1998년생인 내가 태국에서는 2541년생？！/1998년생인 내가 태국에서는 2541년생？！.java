import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = sc.nextInt();
		
		if(1000<= y || y<= 3000){
			
			x= y-543;
			
		}
		
		System.out.println(x);
    }
    
    
}