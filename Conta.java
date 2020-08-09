public class Conta {
   private String nome; 
   private double balanco;

   
   public Conta(String nome, double balanco) {
      this.nome = nome; 

      
      if (balanco > 0.0) { 
         this.balanco = balanco; 
      }
   }

   public void depositar(double valorDeposito) {      
      if (valorDeposito> 0.0) { 
         balanco = balanco + valorDeposito; 
      }
   }

   public double getBalanco() {
      return balanco; 
   } 

   public void setName(String nome) {
      this.nome = nome; 
   } 

   public String getName() {
      return nome; 
   } 
}