import java.security.SecureRandom;

public class RolarDado{
	public static void main(String[] args){
		SecureRandom randomNum = new SecureRandom();
		int[] frequencia = new int[7]; //apesar de ser um array de 7 elementos iremos usar apenas do um em diante
		
		for(int rolar = 1; rolar <= 60_000_000; rolar++){
			++frequencia[1+randomNum.nextInt(6)];
		}
		
		System.out.println("Face  " + "  Frequencia");
		
		for(int face = 1; face < frequencia.length; face++){
			System.out.println(face + "         " + frequencia[face]);
		}
	}	
}