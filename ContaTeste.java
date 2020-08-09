import java.util.Scanner;

public class ContaTeste{
   public static void main(String[] args) {
      Conta conta1 = new Conta("Klebinhuuuh", 30.00);
      Conta conta2 = new Conta("Carlota Joaquina Teresa Cayetana", -100.00);

      System.out.printf("%s balanco inicial: $%.2f%n", conta1.getName(), conta1.getBalanco()); 
      System.out.printf("%s balanco inicial: $%.2f%n%n", conta2.getName(), conta2.getBalanco()); 

      Scanner valor = new Scanner(System.in);

      System.out.printf("Insira valor a ser depositado na conta de %s: ", conta1.getName()); 
      double valorDeposito = valor.nextDouble(); 
      System.out.printf("%nadicionando %.2f valor na conta de %s%n%n", valorDeposito, conta1.getName());
      conta1.depositar(valorDeposito); 

      System.out.printf("%s balanco atualizado: $%.2f%n", conta1.getName(), conta1.getBalanco()); 
      System.out.printf("%s balance atualizado: $%.2f%n%n", conta2.getName(), conta2.getBalanco()); 

      System.out.printf("Insira valor a ser depositado na conta de %s: ", conta2.getName());
      valorDeposito = valor.nextDouble(); 
      System.out.printf("%nadicionando %.2f valor na conta de %s%n%n", valorDeposito, conta2.getName());
      conta2.depositar(valorDeposito); 

      System.out.printf("%s balanco atualizado: $%.2f%n", conta1.getName(), conta1.getBalanco()); 
      System.out.printf("%s balanco atualizado: $%.2f%n%n", conta2.getName(), conta2.getBalanco()); 
   } 
}