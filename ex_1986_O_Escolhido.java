package Uri;

import java.util.Scanner;

public class ex_1986_O_Escolhido {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Alunox[] aluno = new Alunox[n];
		
		int matMaiorNota = 0;
		double  maiorNota = 0;
			
	for(int i = 0; i < n; i++) {
		aluno[i] = new Alunox();
		aluno[i].m = sc.nextInt();
		aluno[i].nota = sc.nextFloat();
	
		if(aluno[i].nota > maiorNota) {
		maiorNota = aluno[i].nota;
		matMaiorNota = aluno[i].m;
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
