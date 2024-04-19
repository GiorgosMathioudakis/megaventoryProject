package Models;

public class SupplierClient {
    private String type;
    private String name;
    private String email;
    private String address;
    private String phone;

    // Constructor
    public SupplierClient(String type,String name, String email, String address, String phone) {
        this.type = type;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String toJson(){
        String productJson =  "{\n" +
                "  \"mvSupplierClient\": {\n" +
                "    \"SupplierClientType\":" + getType() + ",\n" +
                "    \"SupplierClientName\":" + getName() + ",\n" +
                "    \"mvContacts\": [\n" +
                "      {\n" +
                "        \"ContactEmail\":" + getEmail() + "\n" +
                "      },\n" +
                "      {\n" +
                "      }\n" +
                "    ],\n" +
                "    \"SupplierClientShippingAddress\":" + getAddress() + "\n" +
                "  },\n" +
                "  \"mvGrantPermissionsToAllUser\": \"true\",\n" +
                "  \"mvRecordAction\": \"Insert\",\n" +
                "  \"mvInsertUpdateDeleteSourceApplication\": \"Magento\"\n" +
                "}";

        return productJson;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

