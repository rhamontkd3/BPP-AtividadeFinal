package Unidade2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoNumero {

	private int numeroDigitado;

	private void excecaoEntrada(){
		try{
			while (true){
				@SuppressWarnings("resource")
				Scanner entrada = new Scanner(System.in);
				System.out.println("Digite um numero:");
				numeroDigitado = entrada.nextInt();
				System.out.println("Voce digitou " + this.numeroDigitado + ".");
			}
		}catch(InputMismatchException e){
			System.out.println("Este nao e um inteiro numerico.");
		}
	}
	public static void main(String[] args) {
		ExcecaoNumero excecao = new ExcecaoNumero();
	    excecao.excecaoEntrada();
	}
}
