package Sujet_1;

public class Tigre implements Animal{
    private TypeAlimentation alim;
    private boolean verte;
    private String cri;

    public Tigre(TypeAlimentation alim, boolean verte, String cri) {
        this.alim = alim;
        this.verte = verte;
        this.cri = cri;
    }

    @Override
    public TypeAlimentation alimentation() {
        return alim;
    }

    @Override
    public Boolean vertebre() {
        return verte;
    }

    @Override
    public String criAnimal() {
        return cri;
    }

    @Override
    public void afficher() {
        System.out.println("Son alimentation: "+this.alimentation());
        System.out.println("Son cri est le : "+this.criAnimal());
        System.out.println("Est-il vertebre: "+this.vertebre());
    }
}
