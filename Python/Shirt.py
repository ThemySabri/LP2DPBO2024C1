from Clothing import Clothing


class Shirt(Clothing):
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeveType):
        super().__init__(idProduct, name, brand, price, size, material, gender)
        self.color = color
        self.sleeveType = sleeveType

    def get_color(self):
        return self.color

    def set_color(self, color):
        self.color = color

    def get_sleeveType(self):
        return self.sleeveType

    def set_sleeveType(self, sleeveType):
        self.sleeveType = sleeveType

    def __str__(self):
        return super().__str__() + " {:<8s}| {:<10s} |".format(self.color, self.sleeveType)


# Contoh penggunaan kelas Shirt
# shirt = Shirt(1, "Shirt 1", "Brand 1", 25.99, "M",
#               "Cotton", "Male", "Blue", "Short Sleeve")
# print(shirt)
