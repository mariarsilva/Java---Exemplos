/*
Programa de soma de operaçoes
kk
Autor: euzinha bjs
*/

import java.util.Scanner;

public class Sum{
	
	//bla bla bla
	public static void main(String[] args){
		Scanner valor = new Scanner(System.in);

/*
	INT range: -2,147,483,648 to 2,147,483,647

*/

		System.out.print("Insira o primeiro valor numerico: ");
		int num1 = valor.nextInt(); //lendo o primeiro valor

		System.out.print("Insira o segundo valor numerico: ");
		int num2 = valor.nextInt(); //lendo o segundo valor

		int sum = num1 % num2;

		System.out.println("O Valor da Soma e': " + sum);
		System.out.printf("O Valor da Soma e': %d%n", sum);
	}
}