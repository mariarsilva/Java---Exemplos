public class ProgramaDoFeijaoTeste{
  public static void main(String[] args){
    ProgramaDoFeijao feijao1 = new ProgramaDoFeijao("carioquinha", 9, 15);
    ProgramaDoFeijao feijao2 = new ProgramaDoFeijao("carioquinha", 7, 15);
    ProgramaDoFeijao feijao3 = new ProgramaDoFeijao("carioquinha", 9, 10);
    ProgramaDoFeijao feijao4 = new ProgramaDoFeijao("carioquinha", 9, 40);
    ProgramaDoFeijao feijao5 = new ProgramaDoFeijao("carioquinha", 1, 60);
    ProgramaDoFeijao feijao6 = new ProgramaDoFeijao("carioquinha", 4, 10);
   
    verificaSeCozinhou(feijao1);
    verificaSeCozinhou(feijao2);
    verificaSeCozinhou(feijao3);
    verificaSeCozinhou(feijao4);
    verificaSeCozinhou(feijao5);
    verificaSeCozinhou(feijao6);        
    

  }

  public static void verificaSeCozinhou(ProgramaDoFeijao feijao){
    if(feijao.getTempoDeMolho() > 8 && feijao.getTempoCozimento() <= 35){
      System.out.println("Seu feijao ainda esta cru.");
    } else if(feijao.getTempoDeMolho() > 8 && feijao.getTempoCozimento() > 35){
      System.out.println("PARABENS! Seu feijao esta cozido.");
    }else{
      System.out.println("E EU LA SEI NAO SOU ANA MARIA BRAGA.");
    }
  }
}