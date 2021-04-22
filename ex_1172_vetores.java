package Uri;

import java.util.Scanner;

public class ex_1172_vetores {

	public static void main(String[] args) {
	
//		Faça um programa que leia um vetor X[10]. Substitua a seguir,
//		todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
//
//		Entrada
//		A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
//
//		Saída
//		Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
		
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
