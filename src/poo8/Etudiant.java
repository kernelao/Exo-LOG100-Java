package poo8;

public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private String specialite;

    public Etudiant(String nom, String prenom, int age, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getNom() {
        return this.nom;
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public void afficherDetails() {
        System.out.println("Nom : " + this.nom + "\nPrenom : " + this.prenom + "\nAge : " + this.age + "\nSpécialité : " + this.specialite);
    }




}
