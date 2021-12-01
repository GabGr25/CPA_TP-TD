package Sujet_6;

public class SeauSquelette implements Seau{

    private double prix;

    public SeauSquelette() {
        this.prix = 1.5;
    }

    @Override
    public double calculePrix() {
        return prix;
    }

    @Override
    public String libelle() {
        return " SeauSquelette";
    }
}
