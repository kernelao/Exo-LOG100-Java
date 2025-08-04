package serie_1_2;

public class Avion extends Vehicule {

    private int altitudeMax;
    private int capacitePassagers;

    public Avion(int altitudeMax, int capacitePassagers) {
        this.altitudeMax = altitudeMax;
        this.capacitePassagers = capacitePassagers;
    }

    @Override
    public void seDeplacer() {
        System.out.print("L'avion vole dans les airs.");
    }
    @Override
    public void afficherInfos() {
        System.out.print("Altitude max : " + this.altitudeMax + " mètres, Capacité : " + this.capacitePassagers + " passagers.");
    }


}
