package poo4;

/**
 * Classe représentant un magazine, héritant de la classe Document.
 * Contient des informations spécifiques aux magazines.
 *
 * @author kernelao
 * @version 1.0
 */
public class Magazine extends Document{

    private int numeroPeriode;
    private String sujet;

    /**
     * Constructeur de la classe Magazine.
     *
     * @param titre             le titre du magazine
     * @param auteur            l’auteur du magazine
     * @param anneePublication  l’année de publication
     * @param numeroPeriode     le numéro de la période de publication
     * @param sujet             le sujet principal du magazine
     */
    public Magazine(String titre, String auteur, int anneePublication, int numeroPeriode, String sujet) {
        super(titre, auteur, anneePublication);
        this.numeroPeriode = numeroPeriode;
        this.sujet = sujet;
    }

    /**
     * Affiche les détails du magazine : informations communes + période et sujet.
     */
    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Numéro de période : " + this.numeroPeriode +
                           "\nSujet de magazine : " + this.sujet + "\n");
    }
}
