package main;

import com.opencsv.exceptions.CsvValidationException;
import main.adapters.GuardianAPIClient;
import main.adapters.NYTimescsv;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws CsvValidationException, FileNotFoundException {

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
                System.out.println("_______________________________________________");
                NYTimescsv.ListofArticle(CSV_FILE_PATH);
                System.out.println("_______________________________________________");
                break;
            case 2:
                GuardianAPIClient client = new GuardianAPIClient();
                System.out.println("_______________________________________________");
                client.fetchAndPrintArticles();
                System.out.println("_______________________________________________");
                break;
            default:
                System.out.println("Input invalido\n");
        }
        scanner.close();
    }
}



