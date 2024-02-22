#include <iostream>
#include <string>

using namespace std;

class Product
{
protected:
    int idProduct;
    std::string name;
    std::string brand;
    double price;

public:
    Product(int idProduct, std::string name, std::string brand, double price)
    {
        this->idProduct = idProduct;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }

    int getIdProduct()
    {
        return this->idProduct;
    }

    void setIdProduct(int idProduct)
    {
        this->idProduct = idProduct;
    }

    std::string getName()
    {
        return this->name;
    }

    void setName(std::string name)
    {
        this->name = name;
    }

    std::string getBrand()
    {
        return this->brand;
    }

    void setBrand(std::string brand)
    {
        this->brand = brand;
    }

    double getPrice()
    {
        return this->price;
    }

    void setPrice(double price)
    {
        this->price = price;
    }

    std::string toString()
    {
        return "| " + std::to_string(idProduct) + "| " + name + "| " + brand + "| " + std::to_string(price) + " |";
    }
};