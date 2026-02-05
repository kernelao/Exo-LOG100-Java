package poo5;

public class Contact {

    private String nom;
    private String email;

    public Contact(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + this.nom + "\nEmail: " + this.email);
    }

}
