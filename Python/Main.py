from Product import Product
from Clothing import Clothing
from Shirt import Shirt


def main():
    products = []
    print("Selamat Datang di Aplikasi untuk Mengelola Produk Busana")
    input_count = int(
        input("Masukkan berapa banyak item yang akan ditambahkan: "))

    # Input data dari pengguna
    for i in range(input_count):
        print(f"Masukan detail produk {i + 1}:")
        id_product = int(input("ID: "))
        name = input("Name: ")
        brand = input("Brand: ")
        price = float(input("Price: "))
        size = input("Size: ")
        material = input("Material: ")
        gender = input("Gender: ")
        color = input("Color: ")
        sleeve_type = input("Sleeve Type: ")

        products.append(Shirt(id_product, name, brand, price,
                        size, material, gender, color, sleeve_type))

    # Menentukan lebar kolom header untuk menyesuaikan data terpanjang
    column_widths = [len("Product"), len("Name"), len("Brand"), len("Price"), len("Size"), len("Material"),
                     len("Gender"), len("Color"), len("Sleeve Type")]

    for product in products:
        if column_widths[0] < len(str(product.idProduct)):
            column_widths[0] = len(str(product.idProduct))
        if column_widths[1] < len(product.name):
            column_widths[1] = len(product.name)
        if column_widths[2] < len(product.brand):
            column_widths[2] = len(product.brand)
        if column_widths[3] < len(str(product.price)) + 3:
            column_widths[3] = len(str(product.price)) + 3

        if isinstance(product, Clothing):
            clothing = product
            if column_widths[4] < len(clothing.size):
                column_widths[4] = len(clothing.size)
            if column_widths[5] < len(clothing.material):
                column_widths[5] = len(clothing.material)
            if column_widths[6] < len(clothing.gender):
                column_widths[6] = len(clothing.gender)

            if isinstance(product, Shirt):
                shirt = product
                if column_widths[7] < len(shirt.color):
                    column_widths[7] = len(shirt.color)
                if column_widths[8] < len(shirt.sleeveType):
                    column_widths[8] = len(shirt.sleeveType)

    # Tampilkan header tabel dengan lebar kolom yang disesuaikan
    print("+", end="")
    for width in column_widths:
        print("-" * (width + 2) + "+", end="")
    print()

    print("|", end="")
    for i, header in enumerate(["Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"]):
        print(" {:<{}} |".format(header, column_widths[i]), end="")
    print()

    # Tampilkan garis pembatas antara header dan data
    print("+", end="")
    for width in column_widths:
        print("-" * (width + 2) + "+", end="")
    print()

    # Tampilkan data dalam bentuk tabel dengan lebar kolom yang disesuaikan
    for product in products:
        print("|", end="")
        print(" {:<{}} |".format(product.idProduct, column_widths[0]), end="")
        print(" {:<{}} |".format(product.name, column_widths[1]), end="")
        print(" {:<{}} |".format(product.brand, column_widths[2]), end="")
        print(" {:<{}} |".format(
            f"{product.price:.2f}", column_widths[3]), end="")

        if isinstance(product, Clothing):
            clothing = product
            print(" {:<{}} |".format(clothing.size, column_widths[4]), end="")
            print(" {:<{}} |".format(
                clothing.material, column_widths[5]), end="")
            print(" {:<{}} |".format(
                clothing.gender, column_widths[6]), end="")

            if isinstance(product, Shirt):
                shirt = product
                print(" {:<{}} |".format(
                    shirt.color, column_widths[7]), end="")
                print(" {:<{}} |".format(
                    shirt.sleeveType, column_widths[8]), end="")

        print()

    # Tampilkan garis pembatas akhir tabel
    print("+", end="")
    for width in column_widths:
        print("-" * (width + 2) + "+", end="")
    print()
