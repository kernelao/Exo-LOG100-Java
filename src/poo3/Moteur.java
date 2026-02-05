package poo3;

/**
 * Représente un moteur avec un type et une puissance.
 * Un moteur est utilisé pour propulser un véhicule.
 *
 * @author kernelao
 * @version 1.0
 */
public class Moteur {
    private String type;
    private int puissance;

    /**
     * Construit un moteur avec un type et une puissance spécifiés.
     *
     * @param type      le type du moteur (ex. : essence, diesel, électrique)
     * @param puissance la puissance du moteur (en unités arbitraires)
     */
    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    // Getters - accesseurs
    public int getPuissance() {
        return this.puissance;
    }
    public String getType() {
        return this.type;
    }
}
