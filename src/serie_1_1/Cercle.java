package serie_1_1;

public class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * this.rayon;
    }
}
