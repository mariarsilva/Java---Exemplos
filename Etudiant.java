public class Etudiant{
  private String nom;
  private double moyenne_scolaire;

  public Etudiant(String nom, double moyenne_scolaire){
    this.nom = nom;
    if(moyenne_scolaire >= 0.0){
      if(moyenne_scolaire <= 100.00){
        this.moyenne_scolaire = moyenne_scolaire;
      }
    }
  }
  
  public void setNom(String nom){
    this.nom = nom;
  }

  public String getNom(){
    return nom;
  }

  public void setMoyenne(double moyenne_scolaire){
    if(moyenne_scolaire >= 0.0){
      if(moyenne_scolaire <= 100.00){
        this.moyenne_scolaire = moyenne_scolaire;
      }
    } 
  }

  public double getMoyenne(){
    return moyenne_scolaire;
  }

  public void resultatMoyen(double moyenne_scolaire){
    this.moyenne_scolaire =  moyenne_scolaire;
    if(moyenne_scolaire >= 90.0){
      System.out.println("L'etudiant" + nom + "reussi avec la note A.");
    }else if(moyenne_scolaire >= 70.0){
      System.out.println("L'etudiant" + nom + "reussi avec la note B.");
    }else if(moyenne_scolaire >= 50.0){
      System.out.println("L'etudiant" + nom + "reussi avec la note C.");
    }else if(moyenne_scolaire >= 30.0){
      System.out.println("L'etudiant" + nom + "reussi avec la note D.");
    }else{
      System.out.println("L'etudiant" + nom + " n'a pas reussi.");
    }
  }
}