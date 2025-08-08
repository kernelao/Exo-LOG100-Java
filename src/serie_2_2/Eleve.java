package serie_2_2;

public class Eleve implements Comparable<Eleve> {
    private int id;
    private String nom;
    private double note;

    public Eleve(int id, String nom, double note) {
        this.id = id;
        this.nom = nom;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Etudiant{id=" + this.id + " , nom='" + this.nom + "', note=" + this.note + "}";
    }

    @Override
    public int compareTo(Eleve autre) {
        return Double.compare(this.note, autre.note);
    }
}
