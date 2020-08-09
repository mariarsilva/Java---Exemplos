import java.util.Scanner;

public class OuTeste{
  public static void main(String[] args){
    Scanner valor = new Scanner(System.in);
    int x = valor.nextInt();
    int y = valor.nextInt();

    if((x == 5) ^ (y == 5)){
      System.out.println("Verdadeiro");
    }else{
      System.out.println("Falso");
    }
  }
}

