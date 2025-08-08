package serie_3_1;

import java.util.ArrayList;
import java.util.List;

public class Meteo implements Sujet {

    private float temperature;
    private List<Observateur> observateurs = new ArrayList<>();

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifierObservateurs();
    }

    @Override
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(temperature);
        }
    }


}
