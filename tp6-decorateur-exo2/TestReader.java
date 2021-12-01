import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by scoste on 07/11/2017.
 */
public class TestReader {
    public static void main(String[] args) {
        DecoratorReader readerMDP = new CryptoReader(new BufferedReader(new InputStreamReader(System.in)));
        DecoratorReader readerMAJ = new MajusculeReader(readerMDP);
        System.out.println("Entrez votre mot de passe");
        String mdp = readerMDP.readLine();
        System.out.println("Le mot de passe crypté en ROT13 est");
        System.out.println(mdp);

        System.out.println("Entrez votre réponse");
        String rep = readerMAJ.readLine();
        System.out.println("Votre réponse cryptée en ROT13 et en majuscule est");
        System.out.println(rep);
    }
}
