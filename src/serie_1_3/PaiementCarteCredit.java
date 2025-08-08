package serie_1_3;

public class PaiementCarteCredit extends Paiement {
    private String numeroCarte;
    private String nomTitulaire;

    public PaiementCarteCredit(String numeroCarte, String nomTitulaire) {
        this.numeroCarte = numeroCarte;
        this.nomTitulaire = nomTitulaire;
    }

    @Override
    public void effectuerPaiement(double montant) {

        System.out.println("Paiement de " + montant + "$ par carte de crédit effectuée. Numéro : " + numeroCarteSecurise(this.numeroCarte));
    }

    private String numeroCarteSecurise(String numeroCarte) {

        if (numeroCarte == null || numeroCarte.length() < 4) {
            throw new IllegalArgumentException("Numéro de carte invalide.");
        }

        int longueur = numeroCarte.length();
        String derniersChiffres = numeroCarte.substring(longueur - 4);
        String masques = "*".repeat(longueur - 4);

        return masques + derniersChiffres;

    }

}
