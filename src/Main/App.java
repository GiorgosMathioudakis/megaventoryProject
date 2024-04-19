package Main;
import Models.*;
import API.*;

public class App {
    public static void main(String[] args) {
        //necessary API url and API key for requests
        String apiUrl = "https://api.megaventory.com/v2017a";
        String apiKey = "6abbd9c3f0aab76a@m148584";


        Product nike = new Product("1112256","Nike shoes",99.99,44.99);
        Product adidas = new Product("1112248","Adidas shoes",99.99,44.99);
        SupplierClient client = new SupplierClient("Client", "babis", "babis@exampletest.com", "Example 8, Athens", "1235698967");
        SupplierClient supplier = new SupplierClient("Supplier","odysseus", "odysseus@exampletest.com", "Example 10, Athens", "1235698988");
        InventoryLocation inventoryLocation = new InventoryLocation("Test" , "Test Project Location", "Example 20, Athens");

        //creating products
        EditProducts products = new EditProducts();
        //adding both products
        products.addProduct(apiUrl,apiKey, nike.toJson());
        products.addProduct(apiUrl,apiKey,adidas.toJson());

        //creating an inventory
        EditInventoryLocation inventory = new EditInventoryLocation();
        //adding inventory location
        inventory.addInventoryLocation(apiUrl,apiKey,inventoryLocation.toJson());

        //creating supplier-clients
        EditSupplierClient SupplierClients = new EditSupplierClient();
        //adding client
        SupplierClients.addSupplierClient(apiUrl,apiKey,client.toJson());
        //adding supplier
        SupplierClients.addSupplierClient(apiUrl,apiKey,supplier.toJson());

        //creating relationships between products and clients/Suppliers
        //to create a relationship between them I need a GET request for products ID , which is not working but thats the idea
        //and then use that ID with client/supplier add to create the relationship with the following lines of code
        productClient productclient = new productClient();
        productSupplier productsupplier = new productSupplier();
        //creating dummy strings just to show how it would work but it probably wont because of product IDs etc
        String dummystring1 = "{\n" +
                "  \"mvProductClientUpdate\": {\n" +
                "    \"ProductID\": 1,\n" +
                "    \"ProductClient\": 5,\n" +
                "    \"ProductClientPrice\": 0.49\n" +
                "  },\n" +
                "  \"mvRecordAction\": \"Insert\"\n" +
                "}";

        String dummystring2 = "{\n" +
                "  \"mvProductSupplierUpdate\": {\n" +
                "    \"ProductID\": 2,\n" +
                "    \"ProductSupplierID\": 6,\n" +
                "    \"IsMainSupplier\": false,\n" +
                "    \"ProductSupplierLeadTime\": {\n" +
                "      \"LeadTimeDescription\": \"Test Test\"\n" +
                "    },\n" +
                "    \"ProductSupplierQuantityRange\": {\n" +
                "      \"QuantityRangeID\": \"0\",\n" +
                "      \"QuantityRangeDescription\": \"Test\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"mvRecordAction\": \"Insert\"\n" +
                "}";
        //creating relationship between nike and babis
        productclient.addProductClientRelationship(apiUrl,apiKey,dummystring1);
        //creating relationship between adidas and odysseus
        productSupplier.addProductSupplierRelationship(apiUrl,apiKey,dummystring2);

        //5. Update the availability of products in 5 units in the warehouse you added at a cost of 44.99 each.
        // this request requires /InventoryLocationStock API and more specifically POST /InventoryLocationStock/ProductStockUpdate
        //again create a json string and send that with the request
    }
}
