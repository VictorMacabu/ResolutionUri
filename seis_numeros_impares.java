package Uri;

import java.util.Scanner;

public class seis_numeros_impares {

	public static void main(String[] args) {
		/*Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

		Entrada
		A entrada ser� um valor inteiro positivo.

		Sa�da
		A sa�da ser� uma sequ�ncia de seis n�meros �mpares.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		if (X % 2 == 0) {
			X += 1;
			
			for(int i = 0;i < 6;i++) {
				System.out.println(X);
				X+=2;
			}
		}else {
			for(int x = 0;x < 6;x++) {
				System.out.println(X);
				X+=2;
			}
		}		
	}
}
