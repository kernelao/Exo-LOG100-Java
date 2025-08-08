package serie_1_2;

public class Bateau extends Vehicule {
    private int tonnage;
    private int vitesseDeCroisiere;

    public Bateau(int tonnage, int vitesseDeCroisiere) {
        this.tonnage = tonnage;
        this.vitesseDeCroisiere = vitesseDeCroisiere;
    }

    @Override
    public void seDeplacer() {
        System.out.print("Le bateau navigue sur l'eau.");
    }
    @Override
    public void afficherInfos() {
        System.out.print("Tonnage : " + this.tonnage + " tonnes, Vitesse de croisière : " + this.vitesseDeCroisiere + " nœuds.");
    }
}
