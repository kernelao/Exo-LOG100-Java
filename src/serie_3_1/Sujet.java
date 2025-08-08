package serie_3_1;

public interface Sujet {
    public void ajouterObservateur(Observateur observateur);
    public void supprimerObservateur(Observateur observateur);
    public void notifierObservateurs();
}
