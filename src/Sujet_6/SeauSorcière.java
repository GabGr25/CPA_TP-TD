package Sujet_6;

public class SeauSorcière implements Seau{
    private double prix;

    public SeauSorcière() {
        this.prix=0.5;
    }

    @Override
    public double calculePrix() {
        return prix;
    }

    @Override
    public String libelle() {
        return " SeauSorcière ";
    }
}
