package AVFormativa;

import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double celsius,fahrenheit;

		System.out.print("Informe o grau em farenheit: ");
		
		fahrenheit = ler.nextDouble();
		
		celsius=((fahrenheit - 32)*5)/9;
		
		System.out.print(" A temperatura convertida em celsius é: " + celsius);
	}

}
