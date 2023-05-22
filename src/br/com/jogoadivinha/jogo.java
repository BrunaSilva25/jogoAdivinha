package br.com.jogoadivinha;
import java.util.Scanner;
import java.util.Random;

public class jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("JOGO ADIVINHE UM NUMERO:");
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - jogo facil até 10:");
		System.out.println("2 - jogo medio até 50:");
		System.out.println("3 - jogo dificil até 100:");
		
        int numero = entrada.nextInt();
		
		switch(numero){
		
		case 1:
		
			Random gerador = new Random();
			int x = gerador.nextInt(10);
			
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("Adivinhe o numero que estou pensando");
			int num1 = entrada1.nextInt();
			
			if(num1 == x) {
				System.out.println("Parabéns voce acertou!!" + x);
			}
			else {
				System.out.println(" Voce errou , é :" + x);
			}
			break;
			
		case 2:	
			
			
			Random gerador1 = new Random();
			int x1 = gerador1.nextInt(50);
			
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Adivinhe o numero que estou pensando");
			int num2 = entrada2.nextInt();
			
			if(num2 == x1) {
				System.out.println("Parabéns voce acertou!!" + x1);
			}
			else {
				System.out.println(" Voce errou , é :" + x1);
			}
			break;
			
		case 3:
			Random gerador2 = new Random();
			int x2 = gerador2.nextInt(100);
			
			Scanner entrada3 = new Scanner(System.in);
			System.out.println("Adivinhe o numero que estou pensando");
			int num3 = entrada3.nextInt();
			
			if(num3 == x2) {
				System.out.println("Parabéns voce acertou!!" + x2);
			}
			else {
				System.out.println(" Voce errou , é :" + x2);
			}
			break;
			 default:
				System.out.println("ERRO!!");
		
		}
		
    
	
	}

}
