package serie_3_1;

public class AfficheurTemperatures implements Observateur {



    @Override
    public void mettreAJour(float temperature) {
        temperature = (temperature * 1.8f) + 32;
        System.out.println("Météo a changé : " + temperature + "°F");
    }
}
