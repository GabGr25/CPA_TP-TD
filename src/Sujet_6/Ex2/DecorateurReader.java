package Sujet_6.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public abstract class DecorateurReader extends BufferedReader {
    protected BufferedReader bf;

    public DecorateurReader(BufferedReader in) {
        super(in);
        bf=in;
    }

    public String readLine(){
        String s = null;

        try {
            s = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return traite(s);
    }

    abstract String traite(String s);

}
