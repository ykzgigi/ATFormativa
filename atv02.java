package AVFormativa;

import java.util.Scanner;

public class atv02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lados, area;
		
		System.out.println("informe o valor das laterais do quadrado: ");
		lados = ler.nextDouble();
		
		area = lados*lados;
		
		System.out.println("O resultado da área do quadrado é: " +area);
		ler.close();
	}

}
