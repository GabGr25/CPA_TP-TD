package Sujet_3;

public abstract class Animal {

    private StratégieDéplacement deplacement;
    private StratègieCombat attaque;

    public Animal(StratégieDéplacement deplacement,StratègieCombat attaque) {
        this.deplacement=deplacement;
        this.attaque=attaque;
    }

    public  void techDéplacement(){
        deplacement.techDéplacement();


    }

    public void faconCombattre(){
        attaque.techCombat();

    }

    public void setAttaque(StratègieCombat attaque) {
        this.attaque = attaque;
    }

    public void setDeplacement(StratégieDéplacement deplacement) {
        this.deplacement = deplacement;
    }
}
