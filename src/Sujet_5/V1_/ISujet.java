package Sujet_5.V1_;

public interface ISujet {
    void ajouterObservateur(Sujet_5.V1_.IObservateur o);
    void supprimerObservateur(IObservateur o);
    void notifierObservateurs();
}
