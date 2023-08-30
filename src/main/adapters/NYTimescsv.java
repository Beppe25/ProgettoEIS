package main.adapters;

import main.Article;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NYTimescsv {
    public static void ListofArticle(String FilePath){
        String line=""; //linea che analizzo, prendo in considerazione
        Article article= new Article();
        try{
            BufferedReader buffred = new BufferedReader(new FileReader(FilePath));
            buffred.readLine();
            while((line = buffred.readLine()) != null){//analaizzo line in modo da dividere ogni singola riga per colonna -> title = "Titolo Articolo";
                //System.out.println(line);
                String[] data = line.split(","); //ogni volta che incontra una virgola cambia casella di posizionamento
                System.out.println("Title: " + data[2] + "\n");
                System.out.println("BodyText: " + data[3] + data[4]);
                System.out.println("ciao prova\n");
                article.setTitle(data[2]);
                article.setBodyArticle(data[3]);
                System.out.println(article); //stampo l'oggetto article creato
                break;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}

