package Sujet_6;

public class RechargeCaramels extends DecorateurSeau{
    private double prix;

    public RechargeCaramels(Seau s) {
        seau=s;
        this.prix = 1.75;
    }

    @Override
    public double calculePrix() {
        return seau.calculePrix()+prix;
    }

    @Override
    public String libelle() {
        return seau.libelle()+" Caramel";
    }
}
