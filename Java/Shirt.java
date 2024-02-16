/*
Bismillah Saya Themy Sabri Syuhada dengan NIM 2203903.
Demi keberkahan-Nya, saya berjanji mengerjakan
latihan praktikum 2 DPBO dengan jujur dan
tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

// Shirt.java
public class Shirt extends Clothing {
    protected String color;
    protected String sleeveType;

    public Shirt(int idProduct, String name, String brand, double price, String size, String material, String gender,
            String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeveType() {
        return this.sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public String toString() {
        return super.toString() + String.format(" %-8s| %-10s |", color, sleeveType);
    }
}
