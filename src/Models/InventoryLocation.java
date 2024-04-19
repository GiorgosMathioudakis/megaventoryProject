package Models;

public class InventoryLocation {
    private String abbreviation ;
    private String name;
    private String address;

    //Constructor
    public InventoryLocation(String abbreviation , String name , String address){
        this.abbreviation = abbreviation;
        this.name = name;
        this.address = address;

        System.out.println("Created InventoryLocation: " + this);
    }

    @Override
    public String toString() {
        return "InventoryLocation{" +
                "abbreviation='" + abbreviation + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Getters and setters
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toJson() {
        // Convert the Product object to a JSON string for API use
        String productJson =  "{\n" +
                "  \"mvInventoryLocation\": {\n" +
                "    \"InventoryLocationName\":" + getName() + ",\n" +
                "    \"InventoryLocationAbbreviation\":" + getAbbreviation() + "\n" +
                "  },\n" +
                "  \"mvRecordAction\": \"Insert\",\n" +
                "  \"mvInsertUpdateDeleteSourceApplication\": \"MyCompany\"\n" +
                "}";

        return productJson;
    }
}

