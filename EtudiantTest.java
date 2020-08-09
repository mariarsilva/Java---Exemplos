import java.util.Scanner;

public class EtudiantTest{

  public static void main(String[] args){
    Etudiant etudiant = new Etudiant("Jacques", 50.00);
    Scanner valor = new Scanner(System.in);
    String option;
    double moyenne_scolaire;

    System.out.println("L'etudiant: " + etudiant.getNom());
    System.out.println("Moyenne Scolaire: " + etudiant.getMoyenne());
    System.out.print("La Moyenne finale a-t-elle change? Tapez y ou n:");
    
    option = valor.next();
    System.out.println(option);
    while((!option.equalsIgnoreCase("y")) && (!option.equalsIgnoreCase("n"))){
      System.out.println("Vous avez tape la mauvaise option. Veuillez reessayer.");
      System.out.print("La Moyenne finale a-t-elle change? Tapez y ou n:");
      option = valor.next();
     }

     if(option.equalsIgnoreCase("y")){
       System.out.print("Entrez la moyenne scolaire mise à jour: ");
       moyenne_scolaire = valor.nextDouble();
       etudiant.setMoyenne(moyenne_scolaire);      
     }else if(option.equalsIgnoreCase("n")){
       System.out.println("La moyenne scolaire reste la même.");   
     }else{
        System.out.println("Valeur invalide.");
     }

     etudiant.resultatMoyen(etudiant.getMoyenne());  
  }
}