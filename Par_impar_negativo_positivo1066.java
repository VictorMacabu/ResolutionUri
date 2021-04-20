package Uri;

import java.util.Scanner;

public class Par_impar_negativo_positivo1066 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);

		int[] A = new int[5];
		int positivo = 0;
		int negativo = 0;
		int par = 0;
		int impar = 0;

		for(int i = 0; i < A.length; i++ ) {
		A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < A.length; i++ ) {
				if (A[i] > 0 ) {
				positivo ++;
				}if(A[i] < 0) {
				negativo++;
				}
			}
		
		for(int i = 0; i < A.length; i++ ) {
			if (A[i] % 2 == 0 ) {
				par ++;
				}else {
				impar++;
				}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
	}

}
