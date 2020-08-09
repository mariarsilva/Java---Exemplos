public class SomaProduto{
  private int numProduto;
  
  public SomaProduto(int numProduto){
    this.numProduto = numProduto;
  }

  public void somarProdutos(){
    while (numProduto <= 100){
      numProduto = numProduto + 2;
      System.out.println("numero de produtos: " + numProduto);
    }
  }

}