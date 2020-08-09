import java.util.Scanner;

public class NotasSwitch{
  private String nomeEscola;

  public NotasSwitch(String nomeEscola){
    this.nomeEscola = nomeEscola;
  }
  
  public void setNomeEscola(String nomeEscola){
    this.nomeEscola = nomeEscola;    
  }

  public String getNomeEscola(){
    return nomeEscola;
  }

  public void definirNotas(){
    int valorTotal = 0;
    int notaContador = 0;
    int contadorA = 0;
    int contadorB = 0;
    int contadorC = 0;
    int contadorD = 0;
    int contadorF = 0;

    Scanner valor = new Scanner(System.in);
    System.out.println(nomeEscola);
    System.out.println();
    System.out.println("insira o valor das notas de 0 a 100: ");
    System.out.println("Quando finalizar digite:");
    System.out.println("No Linux/macOS: Ctrl-d + enter");
    System.out.println("No Windows: Ctrl-z + enter");

    while(valor.hasNext()){
      int nota = valor.nextInt();
      valorTotal += nota;
      notaContador++;

      switch(nota/10){
        case 9:
        case 10:
          ++contadorA;
          break;
        case 8:
          ++contadorB;
          break;
        case 7:
          ++contadorC;
          break;
        case 6:
          ++contadorD;
          break;
        default: 
          ++contadorF;
          break;
       }
    }
    
    System.out.println("Notas registradas: ");
   
    if(notaContador != 0){
      double media = (double)valorTotal/notaContador;

      System.out.println("Número de notas inseridas: " + notaContador);
      System.out.println("Nota total: " + valorTotal);
      System.out.println();
      System.out.println("Media das classes: " + media);
      System.out.println("Numero de estudantes que receberam cada nota:");
      System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d",
      "nota A: ", contadorA,
      "nota B: ", contadorB,
      "nota C: ", contadorC,
      "nota D: ", contadorD,
      "nota F: ", contadorF);
    }         
  }

}