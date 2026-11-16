package uk.ac.westminster.products_api;

public class Digitalproduct {
}
public class DigitalProduct extends Product {

    // New fields
    private String downloadUrl;
    private double fileSizeMB;

    // Full constructor
    public DigitalProduct(int id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // No-argument constructor
    public DigitalProduct() {
    }

    // Getter for downloadUrl
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for fileSizeMB
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}