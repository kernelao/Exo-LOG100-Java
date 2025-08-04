package serie_1_3;

public class PaiementPayPal extends Paiement {
    private String email;

    public PaiementPayPal(String email) {
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {

        System.out.println("Paiement de " + montant + " $ via PayPal effectuée. Compte :" + this.email);
    }
}
