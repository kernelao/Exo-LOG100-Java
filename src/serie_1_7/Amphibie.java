package serie_1_7;

public class Amphibie implements VehiculeTerrestre, VehiculeAquatique {
    @Override
    public void rouler() {
        System.out.println("Le véhicule amphibie roule sur la terre.");
    }
    @Override
    public void naviguer() {
        System.out.println("Le véhicule amphibie navigue sur la terre.");
    }
}
