package Sujet_6;

public class RechargePralines extends DecorateurSeau{
    private double prix;

    public RechargePralines(Seau s) {
        seau=s;
        this.prix = 1.25;
    }

    @Override
    public double calculePrix() {
        return seau.calculePrix()+prix;
    }

    @Override
    public String libelle() {
        return seau.libelle()+" Praline";
    }
}
