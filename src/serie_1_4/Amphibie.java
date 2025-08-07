package serie_1_4;

public class Amphibie implements Roulant, Volant {
    @Override
    public void rouler() {
        System.out.println("Le véhicule amphibie roule sur la route.");
    }

    @Override
    public void voler() {
        System.out.println("Le véhicule amphibie vole dans les airs.");

    }
}
