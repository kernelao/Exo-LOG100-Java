package poo8;

/**
 * Représente un étudiant avec ses informations personnelles.
 *
 * @author kernelao
 * @version 1.0
 */
public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private String specialite;

    /**
     * Constructeur de la classe Etudiant.
     *
     * @param nom        Le nom de l'étudiant
     * @param prenom     Le prénom de l'étudiant
     * @param age        L'âge de l'étudiant
     * @param specialite La spécialité de l'étudiant
     */
    public Etudiant(String nom, String prenom, int age, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
    }

    // Setters - mutateurs
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

    // Getters - accesseurs
    public String getNom() {
        return this.nom;
    }
    public String getSpecialite() {
        return this.specialite;
    }

    /**
     * Affiche tous les détails de l'étudiant.
     */
    public void afficherDetails() {
        System.out.println("Nom : " + this.nom + "\nPrenom : " + this.prenom + "\nAge : " + this.age + "\nSpécialité : " + this.specialite);
    }




}
