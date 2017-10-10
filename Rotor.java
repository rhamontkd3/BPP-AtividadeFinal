package Enigma;

import java.util.ArrayList;
import java.util.List;

public class Rotor{

	private int posicaoDaLetra;
	private int contadorRotor;
	private List<Character> letras;
	private String alfabeto;
	private String alfabetoEmbaralhadoInicial;
	private String alfabetoEmbaralhadoIntermediario;
	private String alfabetoEmbaralhadoFinal;

	public Rotor(){
		letras = new ArrayList<Character>();
		alfabeto = ("abcdefghijklmnopqrstuvwxyz");
		alfabetoEmbaralhadoInicial = ("qwertyuiovasdfghjklzxcpbnm");
		alfabetoEmbaralhadoIntermediario = ("asdfghjklzxcvbnmqwertyuiop");
		alfabetoEmbaralhadoFinal = ("qazwsxcderfptgbnhyujmkiolv");
	}
	public void percorreAlfabeto(char letraDigitada){
		posicaoDaLetra = alfabeto.indexOf(letraDigitada);
		percorreRotor1(this.posicaoDaLetra);
	}
	private void percorreRotor1(int posicao){
		contaVoltaRotor1();
		char letraNoRotor1 = alfabetoEmbaralhadoInicial.charAt(posicao);
		mudaPosicaoRotor1();
		percorreRotor2(letraNoRotor1);
	}
	private void percorreRotor2(char letra){
		int posicao = 0;
		char letraNoRotor2 = letra;
		while (letraNoRotor2 != alfabetoEmbaralhadoIntermediario.charAt(posicao)){
			posicao++;
		}
		posicaoDaLetra = posicao;
	}
	public char percorreRotor3(){
		char letra = alfabetoEmbaralhadoFinal.charAt(posicaoDaLetra);
		return letra;
	}
	private void contaVoltaRotor1(){
		 if (contadorRotor == alfabeto.length()){
			contadorRotor = 0;
			contadorRotor++;
			mudaPosicaoRotor2();
		}else
			contadorRotor++;
	}
	private void mudaPosicaoRotor1(){
		List<Character> listaCaracteres = new ArrayList<Character>();
		for (int i = 0; i < alfabetoEmbaralhadoInicial.length(); i++){
			listaCaracteres.add(alfabetoEmbaralhadoInicial.charAt(i));
		}
	    listaCaracteres.add(0, alfabetoEmbaralhadoInicial
	    .charAt(alfabetoEmbaralhadoInicial.length() - 1));
		listaCaracteres.remove(listaCaracteres.size() - 1);
		alfabetoEmbaralhadoInicial="";
		for (int i = 0; i < listaCaracteres.size(); i++){
			alfabetoEmbaralhadoInicial += listaCaracteres.get(i);
		}
	}
	private void mudaPosicaoRotor2(){
		List<Character> listaLetras = new ArrayList<Character>();
		for (int i = 0; i < alfabetoEmbaralhadoIntermediario.length(); i++){
			listaLetras.add(alfabetoEmbaralhadoIntermediario.charAt(i));
		}
		listaLetras.add(alfabetoEmbaralhadoIntermediario
		.charAt(alfabetoEmbaralhadoIntermediario.length() - 1));
		listaLetras.remove(listaLetras.size() - 1);
		alfabetoEmbaralhadoInicial.trim();	
		for (int i = 0; i < listaLetras.size(); i++){
			alfabetoEmbaralhadoInicial += listaLetras.get(i);
		}
	}
	@SuppressWarnings("unused")
	private void trocaPosicaoAlfabeto(){
		for (int i = 0; i < alfabeto.length(); i++){
		letras.add(alfabeto.charAt(i));
	  }
		letras.add(alfabeto.charAt(alfabeto.length() - 1));
		letras.remove(letras.size() - 1);
		alfabeto.trim();
	    for (int i = 0; i < letras.size(); i++){
			alfabeto += letras.get(i);
	  }
		   System.out.println(alfabeto);
	}
}
