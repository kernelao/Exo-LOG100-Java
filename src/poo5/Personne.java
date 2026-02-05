package poo5;

/**
 * Classe représentant une personne, héritant de la classe Contact.
 * Contient des informations supplémentaires comme l’âge et le numéro de téléphone.
 *
 * @author kernelao
 * @version 1.0
 */
public class Personne extends Contact {

    private int age;
    private String numeroTelephone;

    /**
     * Constructeur de la classe Personne.
     *
     * @param nom              le nom de la personne
     * @param email            l’adresse email de la personne
     * @param age              l’âge de la personne
     * @param numeroTelephone  le numéro de téléphone de la personne
     */
    public Personne(String nom, String email, int age, String numeroTelephone) {
        super(nom, email);
        this.age = age;
        this.numeroTelephone = numeroTelephone;
    }

    /**
     * Affiche les informations de la personne : nom, email, âge et numéro de téléphone.
     */
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Age : " + this.age + "\nNumero Telephone : " + this.numeroTelephone + "\n");
    }



}
