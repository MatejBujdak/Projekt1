package Tokenizacia;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Stats {

    private static int znaky, vety, riadky, medzeriMedziSlovami;
    private static String riadok = "";

    public static void funkcia(BufferedReader bR) throws IOException {
        while((riadok = bR.readLine()) != null){
            riadky += 1;
            for(int i = 0; i < riadok.length(); i++){
                char ch = riadok.charAt(i);
                if (String.valueOf(ch).matches("(?<![.!?//d])([.!?])")) {
                    vety += 1;
                    znaky += 1;
                }
                else if(ch == ' ' && !String.valueOf(ch).matches("(?<!/s)")){
                    medzeriMedziSlovami += 1;
                    znaky += 1;
                }else{
                    znaky += 1;
                }
            }
        }
        System.out.println("characters: " + znaky + " rows: " + riadky + " sentences: " + vety +
                " words: " + (medzeriMedziSlovami + riadky));
        bR.close();
        }
    }

