package API;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class productClient {
    // Function to call the '/ProductClient/ProductClientUpdate' endpoint
    public static void addProductClientRelationship(String apiUrl, String apiKey, String productClientJson) {
        try {
            // Prepare the URL and headers
            String url = apiUrl + "/ProductClient/ProductClientUpdate";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("APIKEY", apiKey)  // Assuming the API requires an API key
                    .POST(BodyPublishers.ofString(productClientJson))
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
}
