package Sujet_6;

public class RechargeGuimauves extends DecorateurSeau{
    private double prix;

    public RechargeGuimauves(Seau s) {
        seau=s;
        this.prix = 1.5;
    }

    @Override
    public double calculePrix() {
        return seau.calculePrix()+prix;
    }

    @Override
    public String libelle() {
        return seau.libelle()+" Guimauve";
    }
}
