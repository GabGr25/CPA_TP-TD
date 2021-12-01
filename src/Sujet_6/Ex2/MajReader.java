package Sujet_6.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.Locale;

public class MajReader extends DecorateurReader{

    public MajReader(BufferedReader in){
        super(in);
    }

    @Override
    String traite(String s) {
        return s.toUpperCase();
    }
}
