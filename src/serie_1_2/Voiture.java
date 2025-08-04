package serie_1_2;

public class Voiture extends Vehicule {

    private int vitesseMax;
    private int nombreDePortes;

    public Voiture(int vitesseMax, int nombreDePortes) {
        this.vitesseMax = vitesseMax;
        this.nombreDePortes = nombreDePortes;
    }
    @Override
    public void seDeplacer() {
        System.out.print("La voiture se deplace sur la route.");
    }
    @Override
    public void afficherInfos() {
        System.out.print("Vitesse max : " + this.vitesseMax + " km/h, Nombre de portes : " + this.nombreDePortes + ".");
    }
}
