
package main.Main.it.unipd.dei.eis.serialization;
//a file .JSON

        import java.io.File;
        import java.util.ArrayList;
        import main.Main.it.unipd.dei.eis.Article;
        import java.io.FileReader;
        import java.io.IOException;
        import java.io.BufferedReader;


public class Deserialization {

    /*public static Article Deserialize(String filePath, int choice){


            public static Article deserializeArticle(String filePath) {
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String title = null;
                    String bodyArticle = null;
                    String line;

                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(": ");
                        if (parts.length == 2) {
                            String key = parts[0];
                            String value = parts[1];
                            if ("Title".equals(key)) {
                                title = value;
                            } else if ("BodyArticle".equals(key)) {
                                bodyArticle = value;
                            }
                        }
                    }

                    if (title != null && bodyArticle != null) {
                        return new Article(title, bodyArticle);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }

            /*public static void main(String[] args) {
                String filePath = "articolo.txt";
                Article article = deserializeArticle(filePath);

                if (article != null) {
                    System.out.println("Titolo: " + article.getTitle());
                    System.out.println("Corpo del testo: " + article.getBodyArticle());
                } else {
                    System.out.println("Errore nella deserializzazione dell'articolo.");
                }
            }
        }

    }*/
}