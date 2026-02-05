package poo4;

public class Document {
    private String titre;
    private String auteur;
    private int anneePublication;

    public Document(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public void afficherDetail() {
        System.out.println("Titre : " + this.titre +
                           "\nAuteur : " + this.auteur +
                           "\nAnnée de publication : " + this.anneePublication);
    }

}
