public class LivroNota{
	private String nomeCurso;
	private int[] notas; //acredito q nao precise declarar valores pq por ser uma variavel de instancia ja inicia o valor em 0 por padrao
	
	public LivroNota(String nomeCurso, int[] notas){
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}
	
	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	public String getNomeCurso(){
		return nomeCurso;
	}
	
	public void darNota(){
		notaSaida();
		System.out.println("A media da classe e: " + getMedia());
		System.out.println("A media mais baixa: " + getMinimo());
		System.out.println("A media mais alta: " + getMaximo());
		graficoBarraSaida();
	}
	
	public int getMinimo(){
		int notaBaixa = notas[0];
		
		for(int nota:notas){
			if(nota < notaBaixa){
				notaBaixa = nota;
			}
		}
		
		return notaBaixa;
	}
	
	public int getMaximo(){
		int notaAlta = notas[0];
		
		for(int nota:notas){
			if(nota > notaAlta){
				notaAlta = nota;
			}
		}
		
		return notaAlta;
	}
	
	public double getMedia(){
		int total = 0;
		
		for(int nota:notas){
			total+=nota;
		}
		
		return (double)total/notas.length;
	}
	
	public void graficoBarraSaida(){
		System.out.println("Distribuicao de notas:");
		
		int[] frequencia = new int[11];
		for(int nota:notas){
			++frequencia[nota/10];
		}
		
		for(int cont = 0; cont < frequencia.length; cont++){
			if(cont == 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ", cont*10, cont*10+9);
			}
			
			for(int estrela = 0; estrela < frequencia[cont]; estrela++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void notaSaida(){
		System.out.println("As notas sao: ");
		for(int estudante = 0; estudante < notas.length; estudante++){
			System.out.printf("Estudante %2d: %3d%n", estudante+1, notas[estudante]);
		}
	}
}