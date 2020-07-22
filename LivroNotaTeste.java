public class LivroNotaTeste{
	public static void main(String[] args){
		int[] notasAr = {87,68,94,100,83,78,85,91,76,87};
		
		LivroNota livro = new LivroNota("Calculo 3", notasAr);
		
		System.out.println("Sua turma de " + livro.getNomeCurso());
		
		livro.darNota();
	}
}