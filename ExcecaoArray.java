package Unidade2;

import java.util.Scanner;

public class ExcecaoArray{

	@SuppressWarnings({ "resource", "unused" })
	private void verificareLerNumeroDoArray(){
		try{
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero na posicao do array:");
			int numero = entrada.nextInt();
			int numeros[] = new int[numero];
			int elementos[] = new int[numero];	
			for (int i = 0; i <= numero; i++){
				System.out.println("Digite um  numero:");
				elementos[i] = entrada.nextInt();				
			}
		}catch(NegativeArraySizeException ex){
			System.out
			.println("nao foi possivel criar uma posicao no array de elemento negativo.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("nao foi possivel acessar a posição do elemento no array.");
		}
	}
	public static void main(String[] args){
		ExcecaoArray excecaoVetor = new ExcecaoArray();
		excecaoVetor.verificareLerNumeroDoArray();
	}
}
