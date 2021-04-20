package Uri;

import java.util.Scanner;

public class ex_1151_sequencia_fibonacci {

	public static void main(String[] args) {
		
//		A seguinte sequência de números 0 1 1 2 3 5 8 13 21... 
//		é conhecida como série de Fibonacci. Nessa sequência, cada número, 
//		depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um 
//		algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
//
//		Entrada
//		O arquivo de entrada contém um valor inteiro N (0 < N < 46).
//
//		Saída
//		Os valores devem ser mostrados na mesma linha, separados por um espaço em branco.
//      Não deve haver espaço após o último valor.
//		
//		

		Scanner sc = new Scanner(System.in);

		
		int N = sc.nextInt();


		int j = 0;
		int k = 1;
		
		System.out.print(j);
		
		for(int i = 1; i < N; i++) {
				
		System.out.print(" " + k);
		int soma = j + k;
		j = k;
		k = soma;

		}
				
	}

}
