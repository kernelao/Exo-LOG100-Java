package poo3;

/**
 * Représente un véhicule avec une marque, un modèle, un moteur et une vitesse.
 * Fournit des fonctionnalités pour accélérer, freiner, comparer et afficher l'état du véhicule.
 *
 * @author kernelao
 * @version 1.0
 */
public class Vehicule {

    private final int VALEUR_DU_FREIN = 10;

    private String marque;
    private String modele;
    private int vitesse;
    private Moteur moteur;

    /**
     * Construit un véhicule avec la marque, le modèle et le moteur donnés.
     * Si le moteur est null, l'objet n'est pas créé.
     *
     * @param marque  la marque du véhicule
     * @param modele  le modèle du véhicule
     * @param moteur  le moteur associé au véhicule (ne peut pas être null)
     */
    public Vehicule(String marque, String modele, Moteur moteur) {

        if (moteur == null) {
            System.out.println("Échec de création - Le moteur n'existe pas (null)");
            return;
        }

        this.marque = marque;
        this.modele = modele;
        this.vitesse = 0;
        this.moteur = moteur;
    }

    // Getters - accesseurs
    public String getMarque() {
        return this.marque;
    }
    public String getModele() {
        return this.modele;
    }
    public int getVitesse() {
        return this.vitesse;
    }
    public Moteur getMoteur() {
        return this.moteur;
    }

    /**
     * Augmente la vitesse du véhicule en fonction de la puissance du moteur.
     */
    public void accelerer() {
        this.vitesse += moteur.getPuissance();
    }

    /**
     * Diminue la vitesse du véhicule. La vitesse ne peut pas descendre sous 0.
     */
    public void freiner() {
        this.vitesse -= VALEUR_DU_FREIN;
        if (this.vitesse < 0) {
            this.vitesse = 0;
        }
    }

    /**
     * Affiche l'état détaillé du véhicule (marque, modèle, vitesse, type et puissance du moteur).
     *
     * @param vehicule le véhicule à afficher
     */
    public static void afficherEtat(Vehicule vehicule) {

        if (vehicule == null) {
            System.out.println("Le vehicule n'existe pas (null)");
            return;
        }

        System.out.println("Marque de véhicule: " + vehicule.getMarque() + "\n"
                         + "Modele de véhicule: " + vehicule.getModele() + "\n"
                         + "Vitesse de véhicule: " + vehicule.getVitesse() + "\n"
                         + "Moteur de véhicule (type): " + vehicule.getMoteur().getType() + "\n"
                         + "Moteur de véhicule (puissance): " + vehicule.getMoteur().getPuissance() + "\n"
        );
    }

    /**
     * Compare ce véhicule avec un autre en fonction de la vitesse.
     *
     * @param autre le véhicule à comparer
     * @return le véhicule le plus rapide, ou null si égalité
     */
    public Vehicule comparer(Vehicule autre) {

        if (autre == null) {
            System.out.println("Le vehicule que vous voulez comparer n'existe pas (null)");
            return this;
        }

        if (this.vitesse == autre.getVitesse()) {
            return null;
        } else if (this.vitesse > autre.getVitesse()) {
            return this;
        } else {
            return autre;
        }
    }
}
