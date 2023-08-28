package it.unipd.dei.eis;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}



//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//public class NewsArticleDownloader {
//    public static void main(String[] args) throws Exception {
//        // Inserisci qui la chiave API o il token di accesso fornito dal sito
//        String apiKey = "YOUR_API_KEY";
//
//        // Inserisci qui l'URL dell'endpoint dell'API del sito (es. "https://api.example.com/news")
//        String apiUrl = "API_ENDPOINT_URL";
//
//        // Crea un'istanza di HttpClient per effettuare richieste HTTP
//        HttpClient httpClient = HttpClients.createDefault();
//
//        // Crea una richiesta GET specificando l'URL dell'API
//        HttpGet request = new HttpGet(apiUrl);
//
//        // Imposta l'intestazione dell'API key per l'autenticazione
//        request.setHeader("api-key", apiKey);
//
//        // Esegui la richiesta HTTP e ottieni la risposta
//        HttpResponse response = httpClient.execute(request);
//
//        // Estrai il corpo della risposta come stringa
//        String responseBody = EntityUtils.toString(response.getEntity());
//
//        // Stampa il corpo della risposta (puoi elaborarlo ulteriormente come necessario)
//        System.out.println(responseBody);
//    }
//}




/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewsArticleDownloader {
    public static void main(String[] args) throws Exception {
        // Inserisci qui la chiave API o il token di accesso fornito dal sito
        String apiKey = "YOUR_API_KEY";

        // Inserisci qui l'URL dell'endpoint dell'API del sito (es. "https://api.example.com/news")
        String apiUrl = "API_ENDPOINT_URL";

        // Costruisci l'URL completo con i parametri appropriati
        String fullUrl = apiUrl + "?api-key=" + apiKey;

        // Crea un'istanza di URL basata sull'URL completo
        URL url = new URL(fullUrl);

        // Apre una connessione HTTP verso l'URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Imposta il metodo di richiesta a GET
        connection.setRequestMethod("GET");

        // Ottieni lo stream di input dalla connessione per leggere la risposta
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // Leggi la risposta riga per riga
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Stampa la risposta (puoi elaborarla ulteriormente come necessario)
        System.out.println(response.toString());

        // Chiudi la connessione
        connection.disconnect();
    }
}

 */