package Uri;

import java.util.Scanner;

public class ex_1172_vetores {

	public static void main(String[] args) {
	
//		Fa�a um programa que leia um vetor X[10]. Substitua a seguir,
//		todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
//
//		Entrada
//		A entrada cont�m 10 valores inteiros, podendo ser positivos ou negativos.
//
//		Sa�da
//		Para cada posi��o do vetor, escreva "X[i] = x", onde i � a posi��o do vetor e x � o valor armazenado naquela posi��o.
		
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[10];

		for(int i = 0; i < 10; i++) {
			X[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(X[i] <= 0) {
				X[i] = 1;
			}
		System.out.println("X["+i+"] = " + X[i]);
		}
		
	}
	
}
