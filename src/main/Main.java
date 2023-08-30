package main;

import main.adapters.GuardianAPIClient;
import main.adapters.NYTimescsv;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //new InteractiveMenu().runMenu();
        System.out.println("Select choice\n");
        System.out.println("1. Analize Article.csv\n");
        System.out.println("2. Analize from TheGuardian\n");

        //lettura scanner di input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String CSV_FILE_PATH = "/Users/Giuseppe/Desktop/Article/Ny Times Articles/nytimes_articles_v2.csv";
        switch(num){
            case 1:
                System.out.println("Read Data Line by Line With Header \n");
                NYTimescsv.ListofArticle(CSV_FILE_PATH);
                System.out.println("_______________________________________________");
                break;
            case 2:
                GuardianAPIClient client = new GuardianAPIClient();
                //client.fetchAndPrintArticles();
                break;
            default:
                System.out.println("Input invalido\n");
        }
        scanner.close();
    }
}



