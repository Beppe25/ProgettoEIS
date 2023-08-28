package main;
import java.io.File;

import main.adapters.Adapters;
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
        switch(num){
            case 1:
                File directory = new File("./Article/Ny Times Articles");
                File[] filesInDirectory = directory.listFiles();
                NYTimescsv user = new NYTimescsv();
                user.ArticlefromList(filesInDirectory);
                user.toString();
                //System.out.println("\n");
                break;
            case 2:
                GuardianAPIClient client = new GuardianAPIClient();
                client.fetchAndPrintArticles();
                break;
            default:
                System.out.println("Input invalido\n");
        }
        scanner.close();
    }
}