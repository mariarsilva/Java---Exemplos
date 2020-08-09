public class MathExample{

  public static void main(String[] args){
    System.out.println("Potenciacao: " + Math.pow(10.0, 2.0));
    System.out.println("Raiz Quadrada: " + Math.sqrt(10.0)); 
    System.out.println("Valor absoluto: " + Math.abs(-10.0));
    System.out.println("Arredondamento: " + Math.ceil(10.1)); //arredonda sempre para um número maior
    System.out.println("Arredondamento: " + Math.floor(10.1)); //arredonda sempre para um número menor
    System.out.println("Cosseno: " + Math.cos(0.0));
    System.out.println("Seno: " + Math.sin(0.0));
    System.out.println("Tangente: " + Math.tan(0.0));   
    System.out.println("Exponencial e^x: " + Math.exp(1.0)); 
    System.out.println("Logaritmo base e: " + Math.log(1.0)); 
    System.out.println("Valor max entre 2 numeros: " + Math.max(0.0, 3.1));  
    System.out.println("Valor min entre 2 numeros: " + Math.min(0.0, 3.1));

  }
}