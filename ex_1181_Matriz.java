package Uri;

import java.util.Scanner;

public class ex_1181_Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    float mat[][] = new float[12][12];

		    int linha = sc.nextInt();
		    String tipo = sc.next();

		    for(int i = 0; i < mat.length; i++) {
		      for(int j = 0; j < mat[i].length; j++) {
		        mat[i][j] = sc.nextFloat();
		      }
		    }

		    float soma = 0;
		    for(int i = 0; i < mat[linha].length; i++) {
		      soma = soma + mat[linha][i];
		    }

		    if(tipo.equals("M")) {
		      soma = soma / mat[linha].length;
		    }

		    System.out.println(soma);
		  }
		}
		

