public class IncrementoDecremento{

  public static void main(String[] args){
    int x = 10;
    System.out.println("Valor da variavel x: " + x);
    System.out.println("x com incremento prefixo: " + ++x);
    System.out.println("x com incremento sufixo: " + x++);
    System.out.println("Valor de x sufixo atualizado: " + x);

    System.out.println();
    System.out.println();
    
    System.out.println("Resetando valores!!!");
    x = 10;

    System.out.println();
    System.out.println();

    System.out.println("Valor da variavel x: " + x);
    System.out.println("x com decremento prefixo: " + --x);
    System.out.println("x com decremento sufixo: " + x--);
    System.out.println("Valor de x sufixo atualizado: " + x);

   
    
  
  }

}