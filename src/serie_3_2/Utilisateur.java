package serie_3_2;

import java.time.LocalDate;
import java.util.List;
import java.util.Observer;

public class Utilisateur implements Observateur {
    @Override
    public void mettreAJour(List<String> chansons) {
        String message = "Mise à jour de la playlist : [";

        for (String chanson : chansons) {
            if (chanson == chansons.get(chansons.size() - 1)) {
                message += chanson + "]";
                System.out.println(message);
                return;
            }
            message += chanson + ", ";
        }
    }
}
