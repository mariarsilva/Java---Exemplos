public class GraficoBarras{
	public static void main(String[] args){
		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Distribuicao de notas");
		
		for(int contador = 0; contador < array.length; contador++){
			if(contador == 10){
				System.out.println(contador*10 + "-" + contador*10+9);
			}else{
				System.out.println(contador*10 + "-" + contador*10+9);
			}
			
		}
	}
}