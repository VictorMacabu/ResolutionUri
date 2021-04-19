package Uri;

import java.util.Scanner;

public class multiplos_1044 {

	public static void main(String[] args) {
		 
		    Scanner sc = new Scanner(System.in);
		    
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    if((A % B == 0)||(B % A == 0)){
		        System.out.println("Sao Multiplos");
		    }else if ((B % A != 0)||(A % B != 0)){
		        System.out.println("Nao sao Multiplos");
		    }
		    	sc.close();
		    
	}
			
}

