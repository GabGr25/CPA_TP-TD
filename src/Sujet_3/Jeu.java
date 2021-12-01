package Sujet_3;

public class Jeu {
    public static void main(String[] args) {
        Écureuil a  = new Écureuil();
        a.faconCombattre();
        a.techDéplacement();
        a.setDeplacement(new Trottine());
        a.techDéplacement();
    }
}
