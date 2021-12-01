package  Sujet_6.Ex2;

import java.io.BufferedReader;

public class CryptoReader extends DecorateurReader{

    public CryptoReader(BufferedReader in) {
        super(in);
    }

    public char chiffreROT13(char c){
        if(Character.isLowerCase((Character)c))
            return (char)((c-'a'+13)%26+'a');
        else if(Character.isUpperCase((Character)c))
            return (char)((c-'A'+13)%26+'A');
        else return c;
    }

    @Override
    String traite(String s) {
        StringBuilder sb;
        sb=new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i,chiffreROT13(sb.charAt(i)));
        }
        s=sb.toString();
        return s;
    }
}
