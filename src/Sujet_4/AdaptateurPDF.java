package Sujet_4;

public class AdaptateurPDF implements IDocument{

    private ComposantPDF composantPDF;

    public AdaptateurPDF(){
        this.composantPDF=new ComposantPDF();
    }
    @Override
    public void setContenu(String contenu) {
        composantPDF.pdfFixeContenu(contenu);
    }

    @Override
    public void affiche() {
        composantPDF.pdfPrepareAffichage();
        composantPDF.pdfAffiche();
        composantPDF.pdfTermineAffichage();
    }

    @Override
    public void imprime() {
        composantPDF.pdfEnvoieImprimante();
    }
}
