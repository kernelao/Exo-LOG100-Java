package serie_1_3;

public class PaiementVirement extends Paiement {
    private String numeroCompte;
    private String banque;

    public PaiementVirement(String numeroCompte, String banque) {
        this.numeroCompte = numeroCompte;
        this.banque = banque;
    }

    @Override
    public void effectuerPaiement(double montant) {

        System.out.println("Virement de " + montant + " $ vers le compte " + this.numeroCompte + " à la banque " + this.banque + " effectuée.");
    }
}
