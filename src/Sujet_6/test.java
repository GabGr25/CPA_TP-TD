package Sujet_6;

public class test {
    public static void main(String[] args) {
        Seau aa = new RechargeGuimauves(new RechargePralines(new RechargeCaramels(new RechargeReglises(new SeauSorcière()))));
        System.out.println(aa.calculePrix()+"  /  "+aa.libelle());

    }
}
