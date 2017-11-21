package example.foundation.krishan.androiddatabinding;

public class ProductObject {
    private int image;
    private String name;
    private double price;
    private String description;
    public ProductObject(int image, String name, double price, String description) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public int getImage() {
        return image;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}