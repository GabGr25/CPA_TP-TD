import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by scoste on 10/11/2017.
 */
public abstract class DecoratorReader extends BufferedReader {
    protected BufferedReader bf;

    public DecoratorReader(BufferedReader in) {
        super(in);
        bf=in;
    }

    abstract public String traite(String s);

    public String readLine(){
        String s = null;

        try {
            s = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return traite(s);
    }
}
