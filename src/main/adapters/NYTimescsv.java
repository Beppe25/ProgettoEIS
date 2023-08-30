package main.adapters;

import main.Article;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class NYTimescsv {
    public static void ListofArticle(String FilePath) throws CsvValidationException, FileNotFoundException {
        Article article = new Article();
        CSVReader csvReader;
        try {
            csvReader = new CSVReader(new FileReader(FilePath));
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] - Check the file name and path");
            throw new RuntimeException(e);
        }
        try {
            csvReader.readNext(); //skip line 1
            String[] line;
            while((line = csvReader.readNext()) != null){
                if(line.length != 7){
                    throw new CsvValidationException("File con campi sbagliati");
                }
                String title=line[2];
                String bodyArticle=line[3];
                //article.setTitle(title);
                //article.setBodyArticle(bodyArticle);
                article.listofArticles.add(new Article(title, bodyArticle));
                //System.out.println(article.listofArticles);
                //break; //-> legge un articolo
            }
            csvReader.close();
        } catch (IOException e) {
            System.out.println("Errore nella lettura");
        }
        catch (CsvValidationException e){
            System.out.println("Errore - CSV non valido");
        }
    }//chiude funzione
}