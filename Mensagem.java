package Enigma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mensagem{

	private List<Character> letras;
	private String textoInserido;
	private String textoCriptografado;
	private Rotor rotor;

	public Mensagem(){
		letras = new ArrayList<Character>();
		rotor = new Rotor();
	}
	public void mostraTextoCriptografado(){
		criptografaTexto();
		System.out.println("O texto  criptografado e: " + textoCriptografado);
	}
	private void criptografaTexto(){
		recebeTexto();
		limpaTextoCriptografado();
		criptografaLetras();
	}
	private void criptografaLetras(){
		for (int contador = 0; contador < textoInserido.length(); contador++){
			char caractereDaFrase = textoInserido.charAt(contador);
			rotor.percorreAlfabeto(caractereDaFrase);
			char caractereCriptografado = rotor.percorreRotor3();
			letras.add(caractereCriptografado);
			textoCriptografado += letras.get(contador);
		}
	}
	private void limpaTextoCriptografado(){
		textoCriptografado="";
	}
	private void recebeTexto(){
		System.out.println("Digite um frase: ");
		@SuppressWarnings("resource")
		Scanner fraseDoUsuario = new Scanner(System.in);
		textoInserido = fraseDoUsuario.nextLine().replaceAll(" ", "");
	}
}
