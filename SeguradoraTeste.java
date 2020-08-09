public class SeguradoraTeste{

  public static void main(String[] args){
    Seguradora auto1 = new Seguradora(37100, "Fusquinha", "PB");
    Seguradora auto2 = new Seguradora(98493, "Fiat 147", "MA");
    Seguradora auto3 = new Seguradora(20346, "Chevette", "PI");
    Seguradora auto4 = new Seguradora(48309, "Uno mille", "CE");
    
    regrasEstadoNoFault(auto1);
    regrasEstadoNoFault(auto2);
    regrasEstadoNoFault(auto3);
    regrasEstadoNoFault(auto4);
     
  }

  public static void regrasEstadoNoFault(Seguradora auto){
    System.out.println("POLITICAS DA SEGURADORA DE AUTOMOVEIS:");
    System.out.println("Numero do seguro: " + auto.getNumeroConta());
    System.out.println("Modelo do carro: " +  auto.getMarcaModelo());
    System.out.printf("O carro %s em um estado No Fault.%n%n", 
    (auto.EhEstadoNoFault() ? "esta" : "nao esta"));
  }

}

//SeguradoraTeste.java:7: error: integer number too large: 08309
//    Seguradora auto4 = new Seguradora(08309, "Uno mille", "CE");
//ERRO ESTRANHO O.O PQ ESSE NUMERO QUE É O MENOR FICOU TOO LARGE?