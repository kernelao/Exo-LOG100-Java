package poo3;

public class Vehicule {

    private final int VALEUR_DU_FREIN = 10;

    private String marque;
    private String modele;
    private int vitesse;
    private Moteur moteur;

    public Vehicule(String marque, String modele, Moteur moteur) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = 0;
        this.moteur = moteur;
    }

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

    public void accelerer() {
        this.vitesse += moteur.getPuissance();
    }

    public void freiner() {
        this.vitesse -= VALEUR_DU_FREIN;
    }

    public static void afficherEtat(Vehicule vehicule) {
        System.out.println("Marque de véhicule: " + vehicule.getMarque() + "\n"
                         + "Modele de véhicule: " + vehicule.getModele() + "\n"
                         + "Vitesse de véhicule: " + vehicule.getVitesse() + "\n"
                         + "Moteur de véhicule (type): " + vehicule.getMoteur().getType() + "\n"
                         + "Moteur de véhicule (type): " + vehicule.getMoteur().getPuissance()
        );
    }

    public Vehicule comparer(Vehicule autre) {

        if (this.vitesse == autre.getVitesse()) {
            return null;
        } else if (this.vitesse > autre.getVitesse()) {
            return this;
        } else {
            return autre;
        }
    }
}
