package Sujet_5.Ex2;

import java.beans.PropertyChangeEvent;

public class Quotidien extends Observable{
    private NumeroJournal nj,old;
    private int numero;

    public Quotidien(){
        super();
        numero=1;

    }

    public void setNouveauNumero(String titreUne, String contenuUne){
        old=nj;
        nj=new NumeroJournal(numero++,titreUne,contenuUne);
        notifierobs(new PropertyChangeEvent(this,"Journal",old,nj));

    }
}
