package Sujet_6;

public class RechargeSucettes extends DecorateurSeau{
    private double prix;


    public RechargeSucettes(Seau s) {
        seau=s;
        this.prix = 1.75;
    }

    @Override
    public double calculePrix() {
        return seau.calculePrix()+prix;
    }

    @Override
    public String libelle() {
        return seau.libelle()+"Sucette";
    }
}