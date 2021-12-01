import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by scoste on 07/11/2017.
 */
public class MajusculeReader extends DecoratorReader {

    public MajusculeReader(BufferedReader in) {
        super(in);
    }

    public String traite(String s){
        return s.toUpperCase();
    }
}
