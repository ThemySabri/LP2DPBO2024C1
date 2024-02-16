/*
Bismillah Saya Themy Sabri Syuhada dengan NIM 2203903.
Demi keberkahan-Nya, saya berjanji mengerjakan
latihan praktikum 2 DPBO dengan jujur dan
tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

// Product.java
public class Product {
    protected int idProduct;
    protected String name;
    protected String brand;
    protected double price;

    public Product(int idProduct, String name, String brand, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("| %-9d| %-15s| %-10s| %-6.2f |", idProduct, name, brand, price);
    }
}
