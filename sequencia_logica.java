package Uri;

import java.util.Scanner;

public class sequencia_logica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*(i*i)));
			System.out.println(i + " " + ((i*i)+1) + " " + ((i*(i*i))+1));
			
		}

	}

}
