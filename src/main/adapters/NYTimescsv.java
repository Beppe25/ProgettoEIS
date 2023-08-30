package main.adapters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NYTimescsv {
    public static void ListofArticle(String FilePath){
        String line=""; //linea che analizzo, prendo in considerazione
        try{
            BufferedReader buffred = new BufferedReader(new FileReader(FilePath));
            buffred.readLine();
            while((line = buffred.readLine()) != null){//analaizzo line in modo da dividere ogni singola riga per colonna -> title = "Titolo Articolo";
                String[] data = line.split(",");
                System.out.println("Title: " + data[2] + "\n");
                System.out.println("BodyText: " + data[3] + data[4]);
                break;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

