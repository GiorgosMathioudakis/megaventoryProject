package Models;

public class Product {
    private String SKU;
    private String description;
    private double salesPrice;
    private double purchasePrice;

    public Product(String SKU, String description, double salesPrice, double purchasePrice) {
        this.SKU = SKU;
        this.description = description;
        this.salesPrice = salesPrice;
        this.purchasePrice = purchasePrice;

        System.out.println("Created Product: " + this);
    }

    @Override
    public String toString() {
        return "SKU='" + SKU + '\'' +
                ", description='" + description + '\'' +
                ", salesPrice=" + salesPrice +
                ", purchasePrice=" + purchasePrice;
    }

    public String toJson(){
        String productJson =  "{" +
                "  \"mvProduct\": {" +
                "    \"ProductType\": \"ProductType\"," +
                "    \"ProductSKU\":" + getSKU() + "," +
                "    \"ProductDescription\":" + getDescription() + "," +
                "    \"ProductSellingPrice\":" + getSalesPrice() + "," +
                "    \"ProductPurchasePrice\":" + getPurchasePrice() + "," +
                "  }," +
                "  \"mvRecordAction\": \"Insert\"," +
                "  \"mvInsertUpdateDeleteSourceApplication\": \"myself\"" +
                "}";

        return productJson;
    }


    // Getters and setters
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
