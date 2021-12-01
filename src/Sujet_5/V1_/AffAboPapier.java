package Sujet_5.V1_;

public class AffAboPapier implements IObservateur {

    @Override
    public void actualiser(ISujet s) {
        if (s instanceof Sujet_5.V1_.Quotidien) {
            Sujet_5.V1_.Quotidien quotidien = (Quotidien) s;
            System.out.println("Vous pouvez aller chercher votre Quotidien n°" + quotidien.getNumero());
        }
    }
}
