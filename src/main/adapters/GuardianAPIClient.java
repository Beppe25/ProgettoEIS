package main.adapters;
import main.serialization.Deserialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class GuardianAPIClient {
    // Chiave API fornita da The Guardian
    private static final String API_KEY = "87ec1552-3962-48d7-9f7a-3b22f366781c";
    // URL dell'API completo con la chiave API
    private static final String API_URL = "https://content.guardianapis.com/search?q=news&api-key=" + API_KEY;

    // Metodo per recuperare e stampare i titoli degli articoli
    public void fetchAndPrintArticles() {
        int choise =2;
        try {
            // Esegue la richiesta API e ottiene la risposta JSON come stringa
            String response = makeAPIRequest(API_URL);

            // Creazione di un oggetto JSON dalla risposta completa
            JSONObject jsonResponse = new JSONObject(response);
            // Estrazione dell'oggetto "response" dall'oggetto JSON
            JSONObject responseJson = jsonResponse.getJSONObject("response");
            // Estrazione dell'array "results" dall'oggetto "response"
            JSONArray articles = responseJson.getJSONArray("results");

            // Iterazione attraverso gli articoli nell'array "results"
            for (int i = 0; i < articles.length(); i++) {
                JSONObject article = articles.getJSONObject(i);
                // Estrazione del titolo dell'articolo e stampa
                String title = article.getString("webTitle");
                System.out.println("Article Title: " + title);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String makeAPIRequest(String apiUrl) throws IOException {

        // Creazione di un oggetto URL per l'API
        URL url = new URL(apiUrl);
        // Apertura di una connessione HTTP verso l'API
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // Impostazione del metodo di richiesta come GET
        connection.setRequestMethod("GET");

        // Codice di risposta dalla connessione
        int responseCode = connection.getResponseCode();

        // Verifica se la richiesta è andata a buon fine
        if (responseCode == HttpURLConnection.HTTP_OK) {

            // Creazione di un lettore per leggere la risposta dall'API
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            // Lettura della risposta linea per linea e costruzione della risposta completa
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            System.out.println("Request failed with response code: " + responseCode);
            return "";
        }
    }
}
