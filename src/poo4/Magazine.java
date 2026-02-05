package poo4;

public class Magazine extends Document{
    private int numeroPeriode;
    private String sujet;

    public Magazine(String titre, String auteur, int anneePublication, int numeroPeriode, String sujet) {
        super(titre, auteur, anneePublication);
        this.numeroPeriode = numeroPeriode;
        this.sujet = sujet;
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Numéro de période : " + this.numeroPeriode +
                           "\nSujet de magazine : " + this.sujet);
    }
}
