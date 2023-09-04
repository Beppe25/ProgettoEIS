package main.Main.it.unipd.dei.eis.serialization;
//a file .JSON


import java.util.ArrayList;
import main.Main.it.unipd.dei.eis.Article;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Serialization {

    public static void serializeArticlesToFile(ArrayList<Article> articles, String filePath) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

                for (Article article: articles) {
                    writer.write("Titolo: " + article.getTitle() + "\n");
                    writer.write("Contenuto:\n" + article.getBodyArticle() + "\n");
                    writer.newLine();
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }



        System.out.println("Articoli salvati nel file " + filePath);

    }

}