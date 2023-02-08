package Tokenizacia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //pri otvaraní súboru vzniká takzvaná "kontrolovaná výnimka", takže musí byť ošetrená (try, catch)
        try{
            System.out.println("Zadaj súbor");
            BufferedReader bR = new BufferedReader(new FileReader(scan.nextLine()));
            System.out.println("Zadaj príkaz");
            boolean error = true;

        //pokial sa príkazy zhoduju, tak vypíše funkciu s triedy Stats
            while(error){
                String command = scan.next();
            if(command.equals("stats")){
                Stats.funkcia(bR);
                error = false;
            }else{
                System.out.println("Zle zadaný prikaz, skús znovu");
                throw new Error("dsfsda");
            }}

        }catch(IOException e){
            System.out.println("Chyba suboru");
        }


    }
}
