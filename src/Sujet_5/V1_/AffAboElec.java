package Sujet_5.V1_;

public class AffAboElec  implements IObservateur {
    @Override
    public void actualiser(ISujet s) {
        if (s instanceof Sujet_5.V1_.Quotidien) {
            Sujet_5.V1_.Quotidien quotidien = (Quotidien) s;
            System.out.println("Quotidien n°" + quotidien.getNumero()+" est disponible, le titre est :"+quotidien.getTitre()+", l'article de une est : "+quotidien.getArticle());
        }
    }
}
