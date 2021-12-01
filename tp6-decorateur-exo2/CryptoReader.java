import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by scoste on 09/11/2017.
 */
public class CryptoReader extends DecoratorReader {

    public CryptoReader(BufferedReader in) {
        super(in);
    }

    public char chiffreROT13(char c){
        if (Character.isLowerCase((Character)c))
            return (char)((c - 'a' + 13)%26 +'a');
        else if (Character.isUpperCase((Character) c))
            return (char)((c - 'A' + 13)%26 +'A');
        else return c;
    }

    public String traite(String s){
        StringBuilder sb;
        sb = new StringBuilder(s);
        for (int i=0; i<sb.length();i++)
            sb.setCharAt(i, chiffreROT13(sb.charAt(i)));
        s=sb.toString();
        return s;
    }
}
