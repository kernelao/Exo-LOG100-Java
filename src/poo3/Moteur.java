package poo3;

public class Moteur {
    private String type;
    private int puissance;

    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public int getPuissance() {
        return this.puissance;
    }
    public String getType() {
        return this.type;
    }
}
