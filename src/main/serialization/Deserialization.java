package main.serialization;

import java.io.File;
import java.util.ArrayList;
import main.Article;
import java.io.FileWriter;
import java.io.IOException;

public class Deserialization {

    public static void saveArticlesToFile(ArrayList<Article> articles, int choise) {
        if (choise == 2) {
            String Directory = "/Users/Giuseppe/Desktop/Article/APIArticle";
            File folder = new File(Directory);
            folder.mkdirs();
            for (int i = 0; i < articles.size(); i++) {
                Article article = articles.get(i);
                //funzione per file API
                //fileName
                String fileName= article.getTitle();
                String FilePath = fileName + File.separator + fileName;
                try(FileWriter fileWriter = new FileWriter(FilePath)) {
                    //FileWriter fileWriter = new FileWriter(fileName);
                    fileWriter.write("Title: " + article.getTitle() + "\n");
                    fileWriter.write("Body Article:\n" + article.getBodyArticle());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        else if (choise == 1) {
            //funzione per i file csv
            String Directory = "/Users/Giuseppe/Desktop/Article/CSVArticle";
            File folder = new File(Directory);
            //folder.mkdirs();
            for (int i = 0; i < articles.size(); i++) {
                Article article = articles.get(i);
                String fileName = "ArticlefromCSV" + i + ".txt";
                try {
                    FileWriter fileWriter = new FileWriter(fileName);
                    fileWriter.write("Title: " + article.getTitle() + "\n");
                    fileWriter.write("Body Article:\n" + article.getBodyArticle());
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}