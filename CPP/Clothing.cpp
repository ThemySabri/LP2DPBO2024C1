#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

// class Product
// {
// protected:
//     int idProduct;
//     string name;
//     string brand;
//     double price;

// public:
//     Product(int idProduct, string name, string brand, double price)
//     {
//         this->idProduct = idProduct;
//         this->name = name;
//         this->brand = brand;
//         this->price = price;
//     }

//     string toString()
//     {
//         return to_string(idProduct) + "| " + name + "| " + brand + "| " + to_string(price);
//     }
// };

class Clothing : public Product
{
private:
    string size;
    string material;
    string gender;

public:
    Clothing(int idProduct, string name, string brand, double price, string size, string material, string gender)
        : Product(idProduct, name, brand, price)
    {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    string getSize()
    {
        return size;
    }

    void setSize(string size)
    {
        this->size = size;
    }

    string getMaterial()
    {
        return material;
    }

    void setMaterial(string material)
    {
        this->material = material;
    }

    string getGender()
    {
        return gender;
    }

    void setGender(string gender)
    {
        this->gender = gender;
    }

    string toString()
    {
        return Product::toString() + "| " + size + "| " + material + "| " + gender;
    }
};

// int main()
// {
//     Clothing clothing(1, "Shirt", "Brand", 50000, "L", "Cotton", "Male");
//     cout << clothing.toString() << endl;

//     return 0;
// }