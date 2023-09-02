package main.Main.it.unipd.dei.eis;
import main.Main.it.unipd.dei.eis.CountingWords;
import java.util.Map;
import java.util.TreeMap;

public class Article{

    //var. TestoArticolo
    private String Title="";
    CountingWords words = new CountingWords();
    Map<String, String> ArticleMap = new TreeMap<>();

    //var. corpoArticolo
    private String bodyArticle="";

    public Article(String Title,String bodyArticle){
        this.Title=Title;
        this.bodyArticle=bodyArticle;
        ArticleMap.put(Title, bodyArticle);
        ArticleMap.get(Title);
        ArticleMap.get(bodyArticle);
        words.CountingTokens(Title, bodyArticle);
    }
    //Articolo vuoto
    public Article(){
    }

    //set dell'articolo
    //@title -> titolo articolo --> get + set
    //@body -> corpo articolo --> get + set
    public String getTitle(){
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setBodyArticle(String bodyArticle) {
        this.bodyArticle = bodyArticle;
    }

    public String getBodyArticle(){
        return bodyArticle;
    }

    //@Override
    public String toString(){
        return "<article>\n"+ "\t<Title> \n" + "\t" + Title + "\n" +
                "\t <Title>\n" + "\t<bodyArticle> \n" + "\t" + bodyArticle + "\n" +"\t <bodyArticle>\n" +
                "</article>";
    }
}