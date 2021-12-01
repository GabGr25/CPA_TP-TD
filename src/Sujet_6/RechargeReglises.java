package Sujet_6;

public class RechargeReglises extends DecorateurSeau{

    private double prix;

    public RechargeReglises(Seau s) {
        seau=s;
        this.prix = 1;
    }

    @Override
    public double calculePrix() {
        return seau.calculePrix()+prix;
    }

    @Override
    public String libelle() {
        return seau.libelle()+" Réglise";
    }
}
