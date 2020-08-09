import java.util.Scanner;

public class MediaAlunos{
  public static void main(String[] args){
    Scanner valor = new Scanner(System.in);

    int total = 0;
    int contador = 0;
    double media = 0.0;

    System.out.print("Insira a nota de 0 a 100 ou -1 para finalizar: ");
    int nota = valor.nextInt();

    while(nota != -1){
      total = total + nota;
      contador += 1; // contador = contador + 1

      System.out.print("Insira a nota de 0 a 100 ou -1 para finalizar: ");
      nota = valor.nextInt();

      if(contador != 0){
        media = (double) total/contador;
      }else{
        System.out.println("Não foram inseridas notas.");
      }
    }
    
    System.out.println("Valor total da média: " + media);
    System.out.printf("Foram calculadas %d notas%n",contador);
  
  }

}