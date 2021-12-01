package Sujet_4;

import java.sql.SQLOutput;

public class ComposantPDF {
    private String contenu;

    public void pdfFixeContenu(String contenu) {
        this.contenu=contenu;
    }

    public void pdfPrepareAffichage(){
        System.out.println("Prepare l'Affichage");
    }

    public void pdfAffiche(){
        System.out.println(contenu);
    }

    public void pdfTermineAffichage(){
        System.out.println("Termine l'affichage");
    }

    public void pdfEnvoieImprimante(){
        System.out.println("Envoie a l'imprimante");
    }

}
