package poo2;

/**
 * Représente un joueur appartenant à une équipe.
 * Chaque joueur possède un nom, un poste, un numéro de maillot et une note de performance.
 *
 * @author kernelao
 * @version 1.0
 */
public class Joueur {

    private String nom;
    private Poste poste;
    private int numero;
    private int notePerformance;

    /**
     * Crée un nouveau joueur avec les informations données.
     *
     * @param nom le nom du joueur
     * @param poste le poste occupé par le joueur (gardien, défenseur, etc.)
     * @param numero le numéro du joueur (doit être unique dans une équipe)
     * @param notePerformance la note de performance du joueur
     */
    public Joueur(String nom, Poste poste, int numero, int notePerformance) {
        this.nom = nom;
        this.poste = poste;
        this.numero = numero;
        this.notePerformance = notePerformance;
    }

    // Getters - accesseurs
    public int getNumero() {
        return this.numero;
    }
    public int getNotePerformance() {
        return this.notePerformance;
    }
    public Poste getPoste() {
        return this.poste;
    }
    public String getNom() {
        return this.nom;
    }
}
