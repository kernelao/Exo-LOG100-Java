package poo2;

public class Joueur {
    private String nom;
    private Poste poste;
    private int numero;
    private int notePerformance;

    public Joueur(String nom, Poste poste, int numero, int notePerformance) {
        this.nom = nom;
        this.poste = poste;
        this.numero = numero;
        this.notePerformance = notePerformance;
    }
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
