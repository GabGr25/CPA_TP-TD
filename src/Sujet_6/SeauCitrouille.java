package Sujet_6;

public class SeauCitrouille implements Seau{
    private double prix;

    public SeauCitrouille() {
        this.prix = 2.5;
    }

    @Override
    public double calculePrix() {
        return prix;
    }

    @Override
    public String libelle() {
        return " SeauCitrouille";
    }
}
