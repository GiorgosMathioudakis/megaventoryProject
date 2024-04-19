package API;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class EditProducts {

    // Function to call the 'addProduct' endpoint
    public static void addProduct(String apiUrl, String apiKey, String productJson) {
        try {
            // Prepare the URL and headers
            String url = apiUrl + "/Product/ProductUpdate";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("APIKEY", apiKey)  // Assuming the API requires an API key
                    .POST(BodyPublishers.ofString(productJson))
                    .build();

            // Send the POST request
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            // Print the response status code and body
            System.out.println("Response status: " + response.statusCode());
//            System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProduct(String apiUrl, String apiKey, String productJson) {
        try {
            // Prepare the URL and headers
            String url = apiUrl + "/Product/ProductUpdate";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("APIKEY", apiKey)  // Assuming the API requires an API key
                    .GET()
                    .build();

            // Send the POST request
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            // Print the response status code and body
            System.out.println("Response status: " + response.statusCode());
//            System.out.println("Response body: " + response.body());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
