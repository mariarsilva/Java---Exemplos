import java.util.Scanner;

public class MediaEscolar{
  private int numeroNotas;
  private double mediaValor;
  private double total;

  public void setMedia(double mediaValor){
    this.mediaValor = mediaValor;
  }

  public double getMedia(){
    return mediaValor;
  }

  public double definirMedia(){
    Scanner valor = new Scanner(System.in);

    while(numeroNotas < 3){
      System.out.print("Insira a sua nota: ");
      mediaValor = valor.nextDouble();
      total = total + mediaValor;
      numeroNotas = numeroNotas +1;                
    }
    
    mediaValor = total/3;    
    return mediaValor;     
  }

}