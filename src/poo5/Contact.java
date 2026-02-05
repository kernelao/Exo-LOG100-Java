package poo5;

/**
 * Classe représentant un contact générique avec un nom et un email.
 * Sert de classe de base pour les types de contacts comme Personne ou Entreprise.
 *
 * @author kernelao
 * @version 1.0
 */
public class Contact {

    private String nom;
    private String email;

    /**
     * Constructeur de la classe Contact.
     *
     * @param nom   le nom du contact
     * @param email l'adresse email du contact
     */
    public Contact(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    // Getter - accesseur
    public String getNom() {
        return this.nom;
    }

    /**
     * Affiche les informations de base du contact : nom et email.
     */
    public void afficherInfo() {
        System.out.println("Nom: " + this.nom + "\nEmail: " + this.email);
    }

}
