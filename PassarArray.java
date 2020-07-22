public class PassarArray{
	public static void main(String[] args){
		int[] array1 = {1,2,3,4,5};
		
		System.out.println("Efeitos da passagem por referencia de um array inteiro");
		System.out.println("Os valores do array original sao: ");
		
		for(int valor:array1){
			System.out.println(valor);
		}
		
		mudaArray(array1); //passa a referencia do array
		
		System.out.println("Os valores do array depois de chamar o metodo mudaArray: ");
		for(int valor:array1){
			System.out.println(valor);
		}
		
		System.out.println("Efeitos da passagem de um valor de elemento de array.");
		System.out.println("array1[3] antes do metodo mudaElemento: " + array1[3]);
		
		mudaElemento(array1[3]);
		
		System.out.println("array1[3] depois do metodo mudaElemento: " + array1[3]); //nao muda pq passa por copia
	}
	
	public static void mudaArray(int[] array){
		for(int cont = 0; cont < array.length; cont++){
			array[cont]*=2;
		}		
	}
	
	public static void mudaElemento(int elemento){
		elemento*=2;
		System.out.println("Valor do elemento apos passar no metodo mudaElemento: " + elemento);
	}
}