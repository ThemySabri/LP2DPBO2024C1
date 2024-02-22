from Product import Product


class Clothing(Product):
    def __init__(self, idProduct, name, brand, price, size, material, gender):
        super().__init__(idProduct, name, brand, price)
        self.size = size
        self.material = material
        self.gender = gender

    def get_size(self):
        return self.size

    def set_size(self, size):
        self.size = size

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def get_gender(self):
        return self.gender

    def set_gender(self, gender):
        self.gender = gender

    def __str__(self):
        return super().__str__() + " {:<5s}| {:<10s}| {:<6s} |".format(self.size, self.material, self.gender)


# Contoh penggunaan kelas Clothing
# clothing = Clothing(1, "Clothing 1", "Brand 1", 20.75, "M", "Cotton", "Male")
# print(clothing)
