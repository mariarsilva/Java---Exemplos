public class Pesquisa{
	public static void main(String[] args){
		int[] respostas = {1,14,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
		int[] frequencia = new int[6];
		
		for(int resp = 0; resp < respostas.length; resp++){
			try{
				++frequencia[respostas[resp]];				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf(" respostas[%d] = %d%n%n", resp, respostas[resp]);
			}
		}
		
		System.out.println("Nota     |      Frequencia");
		
		for(int nota = 1; nota < frequencia.length; nota++){
			System.out.println(nota + "    |      " + frequencia[nota]);
		}
	}
}