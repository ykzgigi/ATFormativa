package AVFormativa;

import java.util.Scanner;

public class atv03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v01, v02;
		double soma, subtracao, multiplicacao;
		String operacao;


		System.out.println("Informe o primeiro valor: ");
		v01 = ler.nextDouble();

		System.out.println("Informe o segundo valor: ");
		v02 = ler.nextDouble();

		System.out.println("Informe o tipo de operação que deseja + ou - ou * : ");
		operacao = ler.next();

		if (operacao.equals("+")){
			soma = v01+v02;
			System.out.println("O resultado da soma é: " +soma);
		}
		else if (operacao.equals("-")) {
			subtracao =v01-v02;
			System.out.println("O resultado da subtração é: " +subtracao);
		}
		else if (operacao.equals("*")) {
			multiplicacao = v01*v02;
			System.out.println("O resultado da multiplicação é: "+multiplicacao);
		}
		else {
			System.out.println("O sinal utilizado é inválido, tente novamente.");
		}

		ler.close();
	}

}
