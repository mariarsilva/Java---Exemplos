import java.security.SecureRandom;

public class Craps{
  private static final SecureRandom rand = new SecureRandom();
  private enum Status{CONTINUE, VENCEU, PERDEU};
  private static final int DOIS = 2;
  private static final int TRES = 3;
  private static final int SETE = 7;
  private static final int ONZE = 11;
  private static final int DOZE = 12;
 
  public static void main(String[] args){
    int meusPontos = 0;
    Status statusJogo;
    int somaDados = rolarDado();

    switch(somaDados){
      case SETE:
      case ONZE:
        statusJogo = Status.VENCEU;
        break;
      case DOIS:
      case TRES:
      case DOZE:
        statusJogo = Status.PERDEU;
        break;
      default:
        statusJogo = Status.CONTINUE;
        meusPontos = somaDados;
        System.out.println("pontos atuais: " + meusPontos);
        break; 
    }
    
    while(statusJogo == Status.CONTINUE){
      somaDados = rolarDado();
      if(somaDados == meusPontos){
        statusJogo = Status.VENCEU;
      }else{
        if(somaDados == SETE){
          statusJogo = Status.PERDEU;
        } 
      }
    }    
    
    if(statusJogo == Status.VENCEU){
      System.out.println("VOCE VENCEU!!!!!!!!");
    }else{
      System.out.println("VOCE PERDEU!!!!!!!!");
    }
  }

  public static int rolarDado(){
    int dado1 = 1 + rand.nextInt(6);
    int dado2 = 1 + rand.nextInt(6);

    int soma = dado1 +  dado2;

    System.out.println("Dados rolados: " + dado1 + " e " + dado2);
    System.out.println("Valor total: " + soma);

    return soma;
  }
}