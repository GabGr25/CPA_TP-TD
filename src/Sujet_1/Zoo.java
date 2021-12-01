package Sujet_1;

public class Zoo {
    private String nom;
    private Animal[] animal;
    private static final int MAX=100;
    private int nbAnimaux;


    public Zoo(String nom, Animal[] animal) {
        this.nom = nom;
        this.animal = new Animal[MAX];
        this.nbAnimaux=0;
    }

    public String getNom() {
        return nom;
    }

    public void afficherCaracteristique(){
        for (int i = 0; i < nbAnimaux; i++) {
            animal[i].afficher();
        }
    }

    public void ajoutAnimal(Animal ani) throws TableauComplet {
        if(nbAnimaux>=MAX) throw new TableauComplet();
        else{
            animal[nbAnimaux]=ani;
            nbAnimaux++;
        }
    }

    public int nbTypeAnimaux(String typeAnimal){
        int nb=0;
        for (Animal animal:animal) {
            if(animal.getClass().getName().equals(typeAnimal)){
                nb++;
            }
        }
        return nb;
    }
}
