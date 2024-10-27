package utilities;

import com.google.gson.Gson;
import entities.Currency;
import entities.CurrencyId;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangerateHttp {

    ExchangerateKey key = new ExchangerateKey();
    CurrencyId currencyId = new CurrencyId();

    String keyNow = key.getKey();

    public Currency getCurrencyId(int id) {

        try {

            String currencySelect = currencyId.currencySelect(id);
            URI seachCurrency = URI.create("https://v6.exchangerate-api.com/v6/" + keyNow + currencySelect);
            HttpRequest request = HttpRequest.newBuilder().uri(seachCurrency).build();
            HttpResponse<String> response = null;
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (InterruptedException e) {
            System.out.println("Erro de execução");
        } catch (Exception e) {
            System.out.println("Erro de entrada.\nPrograma finalizado...");
        }

        return null;
    }
}
