package main.adapters;

import main.Article;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NYTimescsv extends Adapters {

    public NYTimescsv(){
        super("./Article/Ny Times Articles");
    }

    public NYTimescsv(String FolderDirectory){
        super(FolderDirectory);
    }

    @Override
    public void ArticlefromList(File[] files){
        for(File folderDirectory : files){ //files into filepath => true or false
            CSVReader reader; //crea il reader del csv
            //controlla se la directory è corretta e contiene il file csv da aprire ed analizzare
            try{
                reader = new CSVReader (new FileReader(folderDirectory.toString()));
            }catch(FileNotFoundException e){
                System.out.println("Directory not found- change path");
                throw new RuntimeException(e);
            }
            try{
                //analizzo il file .csv in questione
                reader.readNext();
                String[] nextArticle=null;
                while((nextArticle = reader.readNext()) != null){
                    if(nextArticle.length !=7){
                        throw  new CsvValidationException("Field compiled wrongly");
                    }
                    //posiziona il titolo e corpo nelle posizione 2 e 3 dell'arrayList dell'articolo
                    String title = nextArticle[2];
                    String Articlebody = nextArticle[3];
                    articleList.add(new Article(title,Articlebody));
                    articleList.toString();
                }
                reader.close();
            }catch(IOException e){
                System.out.println("Errore");
            }catch (CsvValidationException e){
                System.out.println("Errore info");
            }
            System.out.println("Scanned file" + folderDirectory);
        }
    }
}