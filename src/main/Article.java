package main;

public class Article{
    //var. TestoArticolo
    private String Title="";


    //var. corpoArticolo
    private String bodyArticle="";

    public Article(String Title,String bodyArticle){
        this.Title=Title;
        this.bodyArticle=bodyArticle;
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
        return "<article>\n"+ "\t<Title> " + Title +
                " </title>\n" + "\t<bodyText> " + bodyArticle + " </bodyArticle>\n" +
                "</article>";
    }
    
}