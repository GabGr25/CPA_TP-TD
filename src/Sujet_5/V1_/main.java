package Sujet_5.V1_;

public class main {
    public static void main(String[] args) {
        Sujet_5.V1_.Quotidien s= new Quotidien(5,"Urgence","Le chien s'est sauvé");
        Sujet_5.V1_.AffAboPapier francis=new AffAboPapier();
        Sujet_5.V1_.AffAboElec thierry=new AffAboElec();
        Sujet_5.V1_.AffAboNotif hugo=new AffAboNotif();

        s.ajouterObservateur(francis);
        s.ajouterObservateur(thierry);
        s.ajouterObservateur(hugo);

        s.setNewNumero("Urgence","Le chien s'est sauvé");
    }
}
