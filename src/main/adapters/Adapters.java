package main.adapters; //manca file path da spostare nella cartella delle stessa directoty

import main.Article;

import java.io.File;
import java.util.ArrayList;



//accesso a cartella per trovare i file

public abstract class Adapters{
    protected ArrayList<Article> articleList;
    protected String FolderDirectory = "/.Article/";//--> nome cartella directory
    protected String folder;

    public Adapters() {
        this.articleList = new ArrayList<>();
        this.folder= getFolderName();  //set e get per la cartella da implementare in Article
    }

    //costruttore
    public Adapters(String folderDirectory){
        this.articleList = new ArrayList<>();
        this.FolderDirectory=folderDirectory;
        this.folder = getFolderName();
    }

    public void Articles(){
        File[] files=new File(FolderDirectory).listFiles();
        ArticlefromList(files);
    }

    //caricamento articolo da file noto
    public void ArticlefromFile(File file){
        ArticlefromList(new File[]{file});
    }

    public abstract void ArticlefromList(File[] files); //lista di file da adapter folder a articlelist

    public Article[] getArticle(){
        return articleList.toArray(new Article[0]);  //returna articolo caricato dall'adapter
    }

    public String getFolderName(){

        //Funzione per ricevere la Folder Name
        String a="5";
        return a;
    }

}