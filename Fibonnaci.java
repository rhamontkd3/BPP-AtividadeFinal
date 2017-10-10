package Unidade2;

/* itera��o= 3s p/n=5, 4s p/n=100, 5s p/n=1000
 * recursao=3s p/n=5, sem estimativa p/n=100, sem estimativa p/n=1000,
 * 
 * No Fibonnaci recursivo o tempo de processamento cresce de forma exponencial, e quando 
 *  chega na sua 56� itera��o, a execu��o demora mais do que o normal, chegando a travar.  
 *  
 *  J� no Iterativo, o algoritmo executa seu processamento de forma rapida, e nao precisa de 
 *  estar recalculando a sequencia de termos, sendo este o algoritmo que teve melhor 
 *  desempenho.  
 *  
 *Logo chegamos a conclus�o que o metodo iterativo teve a execu��o de processamento
 * mais rapido que o recursivo.  
 *
 */
public class Fibonnaci{

	public int recursao(int n){
		if (n < 2)
			return n;
		return recursao(n - 1) + recursao(n - 2);
	}
	private static long tempoInicial = System.nanoTime();

	private int iteracao(int n){
		int numeroAtual = 0;
		int numeroAnterior = 0;
		
		for(int i = 1; i <= n; i++){
			if (i == 1){
				numeroAtual = 1;
				numeroAnterior = 0;
			}else{
				numeroAtual += numeroAnterior;
				numeroAnterior = numeroAtual - numeroAnterior;
			}
		}
		return numeroAtual;
	}
	private static long tempoFinal = System.nanoTime();

	public static void main(String[] args){

		Fibonnaci fibonnaci = new Fibonnaci();
		
		 // comandos para execu��o do metodo recursivo 
		  /*for(int i = 0; i < 5;i++){
		    System.out.println("itera��o " + (i) + " e:" + fibonnaci.recursao(i) +"\t"); }
		 */
		
		// comandos para execu��o do metodo iterativo
		for (int k = 0; k <= 1000; k++){
			System.out.println("Itera��o " + (k) + " e:" + fibonnaci.iteracao(k) + "\t");
		}
		
		{
			long tempoTotal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			System.out.println("tempo em segundos:" + tempoTotal / 1000);
		};
	}
}
