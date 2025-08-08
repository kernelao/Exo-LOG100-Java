package serie_3_1;

public class AfficheurMeteo implements Observateur {

    @Override
    public void mettreAJour(float temperature) {
        System.out.println("Météo a changé : " + temperature + "°C");
    }
}
