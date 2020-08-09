public class Juros{

  public static void main(String[] args){
    double valorInicial = 1000.0; //p
    double taxa = 0.05; //r 

    System.out.println("Ano | " + "Valor de deposito");

    for(int ano = 1; ano <= 10; ano++){
      double valor =  valorInicial * Math.pow(1.0 + taxa, ano);

      System.out.println(ano + "   |  " + valor);
    }
  }

}