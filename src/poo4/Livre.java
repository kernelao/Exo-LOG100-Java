package poo4;

public class Livre extends Document {

    private int nombrePages;
    private Genre genre;

    public Livre(String titre, String auteur, int anneePublication, Genre genre, int nombrePages) {
        super(titre, auteur, anneePublication);
        this.nombrePages = nombrePages;
        this.genre = genre;
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Nombre de pages : " + this.nombrePages +
                           "\nGenre : " + this.genre);
    }

}
