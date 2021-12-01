package Sujet_5.V1_;

import java.util.ArrayList;

public class Quotidien implements ISujet {
    private int numero;
    private String titre;
    private String article;
    private ArrayList<Sujet_5.V1_.IObservateur> listObservateur;

    public Quotidien(int numero, String titre, String article) {
        this.numero = numero;
        this.titre = titre;
        this.article = article;
        this.listObservateur = new ArrayList();
    }

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    public String getArticle() {
        return article;
    }

    @Override
    public void ajouterObservateur(Sujet_5.V1_.IObservateur o) {
        listObservateur.add(o);
    }

    @Override
    public void supprimerObservateur(Sujet_5.V1_.IObservateur o) {
        listObservateur.remove(o);
    }

    @Override
    public void notifierObservateurs() {
        for(IObservateur o: listObservateur)
            o.actualiser(this);
    }

    public void setNewNumero(String titre, String article){
        this.titre=titre;
        this.article=article;
        numero++;
        notifierObservateurs();
    }
}
