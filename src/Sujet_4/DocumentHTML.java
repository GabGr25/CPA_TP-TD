package Sujet_4;

import Sujet_2.Constante;

public class DocumentHTML implements IDocument{
    private String contenu;

    public DocumentHTML() {
    }

    @Override
    public void setContenu(String contenu) {
        this.contenu=contenu;
    }

    @Override
    public void affiche() {
        System.out.println(contenu);
    }

    @Override
    public void imprime() {
        System.out.println("imprime");
    }
}
