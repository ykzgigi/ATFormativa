package AVFormativa;

import java.util.Scanner;

public class atv04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int bingo[] = new int [20];
		
		for(int i=0; i<20;i++) {
			bingo[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int i=0; i<20;i++) {
			System.out.println(" Os números são " + bingo[i]);
		}
		
		ler.close();
	}
	
}
