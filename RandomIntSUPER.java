import java.security.SecureRandom;

public class RandomIntSUPER{
  public static void main(String[] args){
    SecureRandom rand = new SecureRandom();
    
    int frequencia1 = 0;
    int frequencia2 = 0;
    int frequencia3 = 0;
    int frequencia4 = 0;
    int frequencia5 = 0;
    int frequencia6 = 0;

    for(int rolar = 1; rolar <= 60_000_000; rolar++){
      int face = 1 + rand.nextInt();

      switch(face){
        case 1:
          ++frequencia1;
          break;
        case 2:
          ++frequencia2;
          break;
        case 3:
          ++frequencia3;
          break;
        case 4:
          ++frequencia4;
          break;
        case 5:
          ++frequencia5;
          break;
        case 6:
          ++frequencia6;
          break;
      }
    }
    System.out.println("face 1: " + frequencia1 + " vezes.");
    System.out.println("face 2: " + frequencia2 + " vezes.");
    System.out.println("face 3: " + frequencia3 + " vezes.");
    System.out.println("face 4: " + frequencia4 + " vezes.");
    System.out.println("face 5: " + frequencia5 + " vezes.");
    System.out.println("face 6: " + frequencia6 + " vezes.");
  }
}
