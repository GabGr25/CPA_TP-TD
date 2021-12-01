package Sujet_4;

public class ServeurWeb {
    public static void main(String[] args) {
        AdaptateurPDF a = new AdaptateurPDF();
        DocumentHTML h = new DocumentHTML();
        a.setContenu("Bonjour");
        h.setContenu("AU REVOIR");

        a.affiche();
        h.affiche();
        h.imprime();
        a.imprime();
    }
}
