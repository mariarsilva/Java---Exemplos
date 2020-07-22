public class Escopo{
	//acessiveis a todos os metodos dessa classe
	private static int x = 1;
	
	public static void main(String[] args){
		int x = 5; //a variavel local x ira encobrir a anterior
		System.out.println("Valor de x = " + x);
		
		useVariavelLocal();
		useInstancia();
		
		useVariavelLocal();
		useInstancia();
		
		System.out.println("Valor de x na main = " + x);		
	}
	
	public static void useVariavelLocal(){
		int x = 25;
		System.out.println("Valor de x no metodo useVariavelLocal = " + x);
		++x;
		System.out.println("Valor de x ao sair do metodo useVariavelLocal = " + x);	
		System.out.println();			
	}
	
	public static void useInstancia(){
		System.out.println("Valor de x no metodo useInstancia = " + x);
		x*=10;
		System.out.println("Valor de x ao sair do metodo useInstancia = " + x);
		System.out.println();
	}
}