import java.util.Scanner; 

public class BreakFor{

  public static void main(String[] args){
    Scanner valor = new Scanner(System.in);

    System.out.println("O NOVO DIVERTIDO PROGRAMA DE SOMA =-D");
    System.out.println("Nele a soma nunca dara 5");
    System.out.println("Insira o primeiro valor: "); 
    int num1 = valor.nextInt();
    System.out.println("Agora insira o proximo valor: "); 
    int num2 = valor.nextInt();   
    
    for(int contador = 10; contador >= 0; contador--){
       int total = num1 + num2;
       if(total != 5){
         System.out.println("Valor da soma: " + total);
         num1++;
         num2++;  
       }else{
         System.out.println("Ja era meu anjinho, bjs...");
         break;
       }
       
    }
  }



}