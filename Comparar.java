import java.util.Scanner; 

public class Comparar{

   public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);

      System.out.print("Insira o primeiro numero: ");  
      int numero1 = valor.nextInt(); 

      System.out.print("Insira  segundo numero: "); 
      int numero2 = valor.nextInt(); 
      
      //aqui serao feitas as comparacoes
      if (numero1 == numero2) {
         System.out.printf("%d == %d%n", numero1, numero2);
	  }

      if (numero1 != numero2) {
         System.out.printf("%d != %d%n", numero1, numero2);
	  }

      if (numero1 < numero2) {
         System.out.printf("%d < %d%n", numero1, numero2);
	  }

      if (numero1 > numero2) {
         System.out.printf("%d > %d%n", numero1, numero2);
	  }

      if (numero1 <= numero2) {
         System.out.printf("%d <= %d%n", numero1, numero2);
	  }

      if (numero1 >= numero2) {
         System.out.printf("%d >= %d%n", numero1, numero2);
	  }
   } 
} 