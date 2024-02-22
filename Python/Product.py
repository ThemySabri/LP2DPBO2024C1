class Product:
    def __init__(self, idProduct, name, brand, price):
        self.idProduct = idProduct
        self.name = name
        self.brand = brand
        self.price = price

    def get_idProduct(self):
        return self.idProduct

    def set_idProduct(self, idProduct):
        self.idProduct = idProduct

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_brand(self):
        return self.brand

    def set_brand(self, brand):
        self.brand = brand

    def get_price(self):
        return self.price

    def set_price(self, price):
        self.price = price

    def __str__(self):
        return "| {:<9d}| {:<15s}| {:<10s}| {:<6.2f} |".format(self.idProduct, self.name, self.brand, self.price)

# Contoh penggunaan kelas Product
# product = Product(1, "Product 1", "Brand 1", 10.50)
# print(product)
