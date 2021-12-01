package Sujet_5.Ex2;

public class NumeroJournal {
    public int num;
    public String titre;
    public String contenu;

    public NumeroJournal(int num,String titre, String contenu) {
        this.num = num;
        this.titre=titre;
        this.contenu=contenu;
    }

    public int getNum() {
        return num;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }
}
