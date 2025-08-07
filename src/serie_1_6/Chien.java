package serie_1_6;

public class Chien extends Mammifere {

    @Override
    public void manger() {
        System.out.println("Le chien mange de la viande.");
    }
    @Override
    public void dormir() {
        System.out.println("Le chien dort profondément.");
    }
    @Override
    public void seDeplacer() {
        System.out.println("Le chien se déplace rapidement.");
    }

}
