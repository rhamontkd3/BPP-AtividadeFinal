package Unidade2;

public class ExcecaoMetodo{

	private void metodoA(){
		System.out.println("inicia A");
		try{
			metodoB();
		}catch(Exception e){
		System.out.println("nao possivel acessar o indice na memoria.");
		}
		System.out.println("finaliza A.");
	}
	private void metodoB(){
		System.out.println("inicia B.");
		metodoC();
		System.out.println("finaliza B."); 
	}
	private void metodoC(){
		System.out.println("inicia C.");
		metodoD();
		System.out.println("finaliza C.");
	}
	private void metodoD(){
	 System.out.println("inicia D.");
		throw new IndexOutOfBoundsException();
	}
	public static void main(String[] args){
		ExcecaoMetodo excecao = new ExcecaoMetodo();
		excecao.metodoA();
	}
}
