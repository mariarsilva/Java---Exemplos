public class Sobrecarga{
	public static void main(String[] args){
		System.out.println("Quadrado do valor int 7 - " + quadrado(7));
		System.out.println("Quadrado do valor double 7.5 - " + quadrado(7.5));
	}
	
	public static int quadrado(int valorInt){
		System.out.println("aaaaaaaaa");
		return valorInt*valorInt;
	}
	
	public static double quadrado(double valorDouble){
		System.out.println("bbbbbbbb");
		return valorDouble*valorDouble;		
	}
}