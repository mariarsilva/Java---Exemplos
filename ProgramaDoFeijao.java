public class ProgramaDoFeijao{

  private String nomeFeijao;
  private int tempoDeMolho;
  private int tempoCozimento;
  

  public ProgramaDoFeijao(String nomeFeijao, int tempoDeMolho, int tempoCozimento){
    this.nomeFeijao = nomeFeijao;
    this.tempoDeMolho = tempoDeMolho;
    this.tempoCozimento = tempoCozimento;
  }

  public void setNome(String nomeFeijão){
    this.nomeFeijao = nomeFeijao;
  }

  public void setTempoDeMolho(int tempoDeMolho){
    this.tempoDeMolho = tempoDeMolho;
  }
  
  public void setTempoCozimento(int tempoCozimento){
    this.tempoCozimento = tempoCozimento;
  }

  public String getNome(){
    return nomeFeijao;
  }

  public int getTempoDeMolho(){
    return tempoDeMolho;
  }

  public int getTempoCozimento(){
    return tempoCozimento;
  }

}