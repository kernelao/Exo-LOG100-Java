package serie_1_1;

public class Rectangle extends Forme {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return this.longueur * this.largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }
}
