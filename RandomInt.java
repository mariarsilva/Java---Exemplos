import java.security.SecureRandom;

public class RandomInt{
  public static void main(String[] args){
    SecureRandom rand = new SecureRandom();
    for(int cont = 1; cont <= 20; cont++){
      int face = 1 + rand.nextInt();

      //essa parte eh so pra organizar de 5 em 5
      if(cont % 5 == 0){
        System.out.println();
      }  	
    }
  }
}
