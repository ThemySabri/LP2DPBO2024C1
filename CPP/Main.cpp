#include <iostream>
#include <string>
#include <vector>
#include "Shirt.cpp"

using namespace std;

int main()
{
    std::vector<Product *> products;
    std::cout << "Selamat Datang di Aplikasi untuk Mengelola Produk Busana" << std::endl;
    std::cout << "Masukkan berapa banyak item yang akan ditambahkan: ";

    int input;
    std::cin >> input;

    for (int i = 0; i < input; ++i)
    {
        std::cout << "Masukan detail produk " << i + 1 << ":" << std::endl;
        std::cout << "ID: ";
        int id;
        std::cin >> id;
        std::cin.ignore(); // Membuang karakter newline
        std::cout << "Name: ";
        std::string name;
        std::getline(std::cin, name);
        std::cout << "Brand: ";
        std::string brand;
        std::getline(std::cin, brand);
        std::cout << "Price: ";
        double price;
        std::cin >> price;
        std::cin.ignore(); // Membuang karakter newline
        std::cout << "Size: ";
        std::string size;
        std::getline(std::cin, size);
        std::cout << "Material: ";
        std::string material;
        std::getline(std::cin, material);
        std::cout << "Gender: ";
        std::string gender;
        std::getline(std::cin, gender);
        std::cout << "Color: ";
        std::string color;
        std::getline(std::cin, color);
        std::cout << "Sleeve Type: ";
        std::string sleeveType;
        std::getline(std::cin, sleeveType);

        products.push_back(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
    }

    // Menentukan lebar kolom header untuk menyesuaikan data terpanjang
    int columnWidth = 0;
    for (const auto &product : products)
    {
        std::string productString = product->toString();
        size_t pos = productString.find('|');
        while (pos != std::string::npos)
        {
            if (pos > columnWidth)
            {
                columnWidth = pos;
            }
            pos = productString.find('|', pos + 1);
        }
    }

    // Tampilkan tabel
    for (const auto &product : products)
    {
        std::string productString = product->toString();
        size_t pos = productString.find('|');
        std::cout << "+";
        while (pos != std::string::npos)
        {
            for (int i = 0; i < columnWidth + 2; ++i)
            {
                std::cout << "-";
            }
            std::cout << "+";
            pos = productString.find('|', pos + 1);
        }
        std::cout << std::endl;

        pos = 0;
        while (pos != std::string::npos)
        {
            std::cout << "| " << productString.substr(pos + 1, columnWidth) << " ";
            pos = productString.find('|', pos + columnWidth + 3);
        }
        std::cout << "|" << std::endl;
    }

    std::cout << std::endl;

    // Membersihkan memori
    for (const auto &product : products)
    {
        delete product;
    }

    return 0;
}