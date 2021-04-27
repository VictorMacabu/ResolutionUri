package Uri;

import java.util.Scanner;

public class ex_1986_O_Escolhido_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m;
		float nota;
		
		int[] alunos = new int[n];
		float[] notas = new float[n]; 
		
		int matMaiorNota = 0;
		double  maiorNota = 0;
			
	for(int i = 0; i < n; i++) {
		m = sc.nextInt();
		alunos[i] = m;
		nota = sc.nextFloat();
		notas[i] = nota;
		
		if(notas[i] > maiorNota) {
		maiorNota = notas[i];
		matMaiorNota = alunos[i];
		}
	}
	
	if(maiorNota < 8) {
		System.out.println("Minimum note not reached");		
	
	}else if(maiorNota > 8) {
		System.out.println(matMaiorNota);
		
	}
		
		
		sc.close();
	}

}
