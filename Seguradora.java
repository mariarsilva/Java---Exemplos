public class Seguradora{

  private int numeroConta;
  private String marcaModelo;
  private String estado;
  

  public Seguradora(int numeroConta, String marcaModelo, String estado){
    this.numeroConta = numeroConta;
    this.marcaModelo = marcaModelo;
    this.estado = estado;
  }


  public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
  }

  public int getNumeroConta(){
    return numeroConta;
  }

  public void setMarcaModelo(String marcaModelo){
    this.marcaModelo = marcaModelo;
  }

  public String getMarcaModelo(){
    return marcaModelo;
  }

  public void setEstado(String estado){
    this.estado = estado;
  }

  public String getEstado(){
    return estado;
  }

  public boolean EhEstadoNoFault(){
    boolean estadoNoFault;

    switch(getEstado()){
      case "PB": case "SE": case "AL": case "CE":
        estadoNoFault = true;
        break;

      default:
        estadoNoFault = false;
        break;  
    }
    
    return estadoNoFault;  
  }

}