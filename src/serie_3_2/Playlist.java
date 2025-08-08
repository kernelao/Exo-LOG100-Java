package serie_3_2;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Sujet {
    private List<Observateur> observateurs = new ArrayList<>();
    private List<String> sons = new ArrayList<>();

    public void ajouterChanson(String nom) {
        sons.add(nom);
        System.out.println("Process terminée... une nouvelle chanson vient d'être ajoutée : " + nom + ". Notification en cours...");
        notifierObservateurs();
    }

    public void afficherChanson() {
        String message = "\"";
        for (String son : sons) {
            if (son == sons.get(sons.size() - 1)) {
                message += son + "\"";
            }
        }
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
            observateur.mettreAJour(sons);
        }
    }
}
