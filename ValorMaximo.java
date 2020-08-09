import java.util.Scanner;

public class ValorMaximo{
   public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);

      System.out.print("Insira tres numeros inteiros: ");
      int num1 = valor.nextInt(); 
      int num2 = valor.nextInt();
      int num3 = valor.nextInt(); 

      int resultado = maximo(num1, num2, num3); 

      System.out.println("Maximum is: " + resultado);
   } 
         
   public static int maximo(int x, int y, int z) {   
      int valorMax= x; 
                                                                
      if (y > valorMax) {                                     
         valorMax = y;                                        
      }                                                           
                                                                
      if (z > valorMax) {                                     
         valorMax = z;                                        
      }                                                           
                                                                  
      return valorMax;                                        
   }                                                              
} 